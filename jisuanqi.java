package 测试;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test{ 
            public static void main(String [] agur){
         jisuan frame = new jisuan();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.setVisible(true);
       }
}
class jisuan extends JFrame implements ActionListener{
    private JMenuBar  menubar = new JMenuBar();
    private JMenu  m1 = new JMenu("文件(field)");
    private JMenu  m2 = new JMenu("编辑(education)");
    private JMenu  m3 = new JMenu("帮助(help)");
    private JMenuItem  t1,t2,t3,t4,t5,t6,t7,t8;
    private JPanel j1,j2;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton kaigen,qiuyu,pingfang,zengxuan,yuxuan ,jiecheng,jia,jian,cheng,chu,dengyu;
    private Container contenPane = getContentPane();
    private JTextField  p1,p2;
    private JLabel  j0;
    private double tem1 = 0;
    private double tem2 = 0;
    private double tem3 = 0;
    private int biaozhi=0;
    public jisuan(){
     super.setTitle("简单计算器");
     super.setSize(640,200);
     setJMenuBar(menubar);
     menubar.add(m1);
     menubar.add(m2);
     menubar.add(m3);
     t1 = new JMenuItem("打开");
     t2 = new JMenuItem("全部清零");
     t3 = new JMenuItem("打开圆周率");
     t4 = new JMenuItem("退出");
     m1.add(t1);
     m1.add(t2);
     m1.add(t3);
     m1.add(t4);
     t5 = new JMenuItem("简单的加减计算器");
     t6 = new JMenuItem("画图");
     t7 = new  JMenuItem("写字本");
     m2.add(t5);
     m2.add(t6);
     m2.add(t7);
     t8 = new JMenuItem("关于....");
     m3.add(t8);
     j1 = new JPanel();
     p1 = new JTextField(40);
     p1.setEditable(false);
     j0 = new JLabel("请输入要计算的数字：");
//     p2 = new JTextField("请输入计算的数字",10);
//     p3 = new JTextField("结果是",10);
//     p3.setEditable(false);
     j1.add(j0);
     j1.add(p1);
//     j1.add(p2);
//         j1.add(p3);
     j2 = new JPanel();
     GridLayout f = new GridLayout(3,7);
     j2.setLayout(f);
     b0 = new JButton("0");
     b1 = new JButton("1");
     b2 = new JButton("2");
     b3 = new JButton("3");
     b4 = new JButton("4");
     b5 = new JButton("5");
     b6 = new JButton("6");
     b7 = new JButton("7");
     b8 = new JButton("8");
     b9 = new JButton("9");
//     j3 = new JPanel();
     j2.add(b0);
     j2.add(b1);
     j2.add(b2);
     j2.add(b3);
     j2.add(b4);
     j2.add(b5);
     j2.add(b6);
     j2.add(b7);
     j2.add(b8);
     j2.add(b9);
     jia = new JButton("+");
     jian = new JButton("-");
     cheng  = new JButton("*");
     chu = new JButton("/");
     kaigen = new JButton("立方根");
     qiuyu = new JButton("平方根");
     pingfang = new JButton("平方");
     zengxuan = new JButton("sin");
     yuxuan = new JButton("cos");
     jiecheng = new JButton("阶乘");
     dengyu = new JButton("=");
     j2.add(jia);
     j2.add(jian);
     j2.add(cheng);
     j2.add(chu);
     j2.add(kaigen);
     j2.add(qiuyu);
     j2.add(pingfang);
     j2.add(zengxuan);
     j2.add(yuxuan);
     j2.add(jiecheng);
     j2.add(dengyu);
     contenPane.add(j2,BorderLayout.CENTER);
     contenPane.add(j1,BorderLayout.NORTH);
     b0.addActionListener(this);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     jia.addActionListener(this);
     jian.addActionListener(this);
     cheng.addActionListener(this);
     chu.addActionListener(this);
     kaigen.addActionListener(this);
     qiuyu.addActionListener(this);
     pingfang.addActionListener(this);
     zengxuan.addActionListener(this);
     yuxuan.addActionListener(this);
     jiecheng.addActionListener(this);
     dengyu.addActionListener(this);
     t2.addActionListener(this);
     t3.addActionListener(this);
     t4.addActionListener(this);
     t7.addActionListener(this);
     t8.addActionListener(this);
    } 
     public void actionPerformed(ActionEvent e){  
     if(e.getSource()==b0){
      p1.setText("0");
      j1.add(p1);
      tem1 = 0;
         }
     else if(e.getSource() == b1){
      p1.setText("1");
      j1.add(p1);
      tem1 = 1;
     }
     else if(e.getSource() == b2){
      p1.setText("2");
      j1.add(p1);
      tem1 = 2;
     }
     else if(e.getSource() == b3){
      p1.setText("3");
      j1.add(p1);
      tem1 = 3;
     }
     else if(e.getSource() == b4){
      p1.setText("4");
      j1.add(p1);
      tem1 = 4;
     }
     else if(e.getSource() == b5){
      p1.setText("5");
      j1.add(p1);
      tem1 = 5;
     }
     else if(e.getSource() == b6){
      p1.setText("6");
      j1.add(p1);
      tem1 = 6;
     }
     else if(e.getSource() == b7){
      p1.setText("7");
      j1.add(p1);
      tem1 = 7;
     }
     else if(e.getSource() == b8){
      p1.setText("8");
      j1.add(p1);
      tem1 = 8;
     }
     else if(e.getSource() == b9){
      p1.setText("9");
      j1.add(p1);
      tem1 = 9;
     }
     if(e.getSource()==jia){
      p1.setText(tem1+"+");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 0;     }
     if(e.getSource()==jian){
      p1.setText(tem1+"-");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 1;
     }
     if(e.getSource()==cheng){
      p1.setText(tem1+"*");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 2;
     }
     if(e.getSource()==chu){
      p1.setText(tem1+"/");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 3;
   }
     if(e.getSource()==kaigen){
      p1.setText(tem1+"立方根");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 4;
       }
     if(e.getSource()==qiuyu){
      p1.setText(tem1+"平方根");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 5;
       }
     if(e.getSource()==pingfang){
      p1.setText(tem1+"平方");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 6;
       }
     if(e.getSource()==zengxuan){
      p1.setText(tem1+"sina");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 7;
       }
     if(e.getSource()==yuxuan){
      p1.setText(tem1+"cosa");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 8;
       }
     if(e.getSource()==jiecheng){
      p1.setText(tem1+"!");
      j1.add(p1);
      tem2 = tem1;
      biaozhi = 9;
       }
     if(e.getSource()==dengyu){
      if(biaozhi ==0){tem3 = tem2+tem1;}
      if(biaozhi ==1){tem3 = tem2-tem1;}
      if(biaozhi ==2){tem3 = tem2*tem1;}
      if(biaozhi ==3){tem3 = tem2/tem1;}
      if(biaozhi ==4){tem3 = Math.cbrt(tem1);}
      if(biaozhi ==5){tem3 =Math.sqrt(tem1);}
      if(biaozhi ==6){tem3 = tem1*tem1;}
      if(biaozhi ==7){tem3 = Math.sin(tem1);}
      if(biaozhi ==8){tem3 = Math.cos(tem1);}
      if(biaozhi ==9){tem3 = jisuanjiecheng(tem1);}
      p1.setText("="+tem3);
      j1.add(p1);
    
       }
     else if(e.getSource()==t2){
      p1.setText("0.0");
      j1.add(p1);
     }
     else if(e.getSource()==t3){
      p1.setText(Math.PI+"");
      j1.add(p1);
     }
     else if(e.getSource()==t4){
      System.exit(0);
     }
     else if(e.getSource()==t5){
      repaint();
      this.jiandanjisuan();
      }
     else if(e.getSource()==t8){
      System.out.println("这是一个简单的GUI应用程序");
     }
     else if(e.getSource()==t7){ 
      repaint();
      new jishiben(contenPane);
     }
     }
     private double  jisuanjiecheng(double  a){
         if(a==1)  return 1;
         else  return (jisuanjiecheng(a-1)*a);
     }
     public void jiandanjisuan(){
          p1 = new JTextField(20);
          p2 = new JTextField(20);
          j0 = new JLabel("输入你要计算的数字");
          j1 = new JPanel();
          j1.add(j0);
          j1.add(p1);
          j1.add(p2);
          j2 = new JPanel();
          jia = new JButton("+");
          jian = new JButton("-");
          cheng = new JButton("*");
          chu = new JButton("/");
          j2.add(jia);
          j2.add(jian);
          j2.add(cheng);
          j2.add(chu);
          contenPane.add(j2,BorderLayout.CENTER);
    contenPane.add(j1,BorderLayout.NORTH);
     }
 
}
class jishiben extends jisuan {
    private Container contenPane1 = getContentPane();
    private JTextArea  text = new JTextArea();
    private JButton baobutton,tuibutton;
    private JLabel l;
    private JPanel ji1,ji2,ji3;
    public jishiben(Container cont ){
     this.contenPane1 = cont;
     ji1 = new JPanel();
     ji2 = new JPanel();
     ji3 = new JPanel();
     l = new JLabel("请输入你要记录的文字");
     baobutton = new JButton("保存为");
     tuibutton = new JButton("退出");
     ji1.add(l);
     ji2.add(text);
     ji3.add(baobutton);
     ji3.add(tuibutton);
     contenPane1.add(ji2,BorderLayout.CENTER);
     contenPane1.add(ji1,BorderLayout.NORTH);
     contenPane1.add(ji3,BorderLayout.SOUTH);
    }
}