import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
class jishu{
    public static int corret=0 ;
    public static int cuo=0 ;
    public static int sum=0 ;
    public static TimerCount timerCount=new TimerCount();
}
public class Start extends JFrame {

    double result1=0;
    int m=0;

    public Start(){
        super("四则运算");
        EasyOperation easyOperation = new EasyOperation();
            JPanel pane1 = new JPanel();
            FlowLayout flow = new FlowLayout(); //流式格局
            pane1.setLayout(new FlowLayout());
            JButton button1 = new JButton("提交");

            button1.setLayout(flow);
            Box box = Box.createVerticalBox();

            int sign1 = (int) (Math.random() * 3); //产生0-3的随机数
            int sign2 = (int) (Math.random() * 3); //产生0-3的随机数
            int x = 1 + (int) (Math.random() * 99);
            int y = 1 + (int) (Math.random() * 99);
            int z = 1 + (int) (Math.random() * 99);
            int j = 1 + (int) (Math.random() * 9);
            int sign3 = 1 + (int) (Math.random() * 3);
            String result = "";

            if (sign3 == 1) {
                result1 = easyOperation.jiecheng(j);
                JLabel timu = new JLabel(j + "!=?");
                timu.setFont(new java.awt.Font("楷体", 1, 20));
                box.add(timu);
            } else {
                result = easyOperation.count(x, y, z, sign1, sign2);
                result1 = easyOperation.count1(x, y, z, sign1, sign2);
                JLabel timu = new JLabel(result);
                timu.setFont(new java.awt.Font("楷体", 1, 20));
                box.add(timu);
            }
            JTextField text = new JTextField(10);
            // double

            box.add(text);
            box.add(button1);
            button1.addActionListener(new ActionListener() /*设置键盘监听*/ {

                public void actionPerformed(final ActionEvent e) {
              double shuru = '0';
              shuru = Double.parseDouble(text.getText());
              if (shuru == result1) {
                  JLabel jieguo = new JLabel("回答正确！");
                  jieguo.setFont(new java.awt.Font("楷体", 1, 20));
                  box.add(jieguo);
                  jishu.corret++;
                  jishu.sum++;
                  pane1.setVisible(false);
                  pane1.setVisible(true);
                  Object[] options = {"继续", "结束"};  //自定义按钮上的文字
                   m = JOptionPane.showOptionDialog(null, jieguo, "结果", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                  //最后一个决定退出的按钮
                  if (m == 1) {
                      JOptionPane.showMessageDialog(null, "答对题数为：" + jishu.corret+"答错题数为：" + jishu.cuo+" 用时为："+" 用时为："+jishu.timerCount.count+"秒");
                      System.exit(1);  //无论是否执行都退出
                  } else {
                      if(jishu.sum<=5) {
                          JFrame frame = new Start();
                          frame.setTitle("四则运算");
                          frame.setSize(300, 200);
                          frame.setLocationRelativeTo(null);
                          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          frame.setVisible(true);
                      }
                      else {
                          JOptionPane.showMessageDialog(null, "答题数已经超过五题!!!");
                          JOptionPane.showMessageDialog(null, "答对题数为：" + jishu.corret+"答错题数为：" + jishu.cuo+" 用时为："+" 用时为："+jishu.timerCount.count+"秒");
                          System.exit(1);  //无论是否执行都退出
                      }
                  }
              } else {
                  JLabel jieguo = new JLabel("回答错误！正确答案为:" + result1);
                  jieguo.setFont(new java.awt.Font("楷体", 1, 20));
                  jishu.cuo++;
                  jishu.sum++;
                  Object[] options = {"继续", "结束"};  //自定义按钮上的文字
                  m = JOptionPane.showOptionDialog(null, jieguo, "结果", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                  //最后一个决定退出的按钮
                  if (m == 1) {
                      JOptionPane.showMessageDialog(null, "答对题数为：" + jishu.corret+"答错题数为：" + jishu.cuo+" 用时为："+jishu.timerCount.count+"秒");
                      System.exit(1);  //无论是否执行都退出
                  } else {
                      if(jishu.sum<=5) {
                          JFrame frame = new Start();
                          frame.setTitle("四则运算");
                          frame.setSize(300, 200);
                          frame.setLocationRelativeTo(null);
                          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          frame.setVisible(true);
                      }
                      else {
                          JOptionPane.showMessageDialog(null, "答题数已经超过五题!!!");
                          JOptionPane.showMessageDialog(null, "答对题数为：" + jishu.corret+"答错题数为：" + jishu.cuo+" 用时为："+" 用时为："+jishu.timerCount.count+"秒");
                          System.exit(1);  //无论是否执行都退出
                      }
                  }

              }

          }
            });
            pane1.add(box);
            this.add(pane1);

    }

    public static void main(String[] args) {
            JFrame frame = new Start();
            frame.setTitle("四则运算");
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }

}
