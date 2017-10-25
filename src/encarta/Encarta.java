package encarta;


import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

import java.io.*;


public class Encarta {
        Integer hint;
        int[] status= new int[20];
        static Byte h=0,m=0,s=0,correct=0;
        static int flag=0,marks=0,Running1=1,Running2=1,Running3=1,Running4=1,Running5=1,Running6=1,Running7=1,Running8=1,Running9=1,Running10=1,Running11=1,Running12=1,Running13=1,Running14=1,Running15=1,Running16=1,Running17=1,Running18=1,Running19=1,Running20=1;
         static JLabel hrs,min,sec,time;
        static JFrame jf1,jf2,jf3,jf4,jf5,jf6,jf7,jf8,jf9,jf10,jf11,jf12,jf13,jf14,jf15,jf16,jf17,jf18,jf19,jf20;
	JFrame jf;
	JLabel jl,jl0,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14;
	JTextField jt1,jt2,jt3,jt4;
	JPanel jp1,jp2,jp3;
	JButton jb1;
        
         
        
	Encarta() throws IOException
	{       
                Encarta.correct=1;
		jf=new JFrame("PICK-A-PIC");
		jf.setSize(1370, 800);
		jf.setLayout(null);
		jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 100);
		jl=new JLabel("PiCk-A-PiC");
		jl.setForeground(Color.white);
		jl.setFont(new Font("Algerian", Font.BOLD, 70));
		jp1.add(jl);
		jp1.setBackground(Color.black);
		jp2=new JPanel();
		jp2.setBounds(0,100,1380,150);
		jp2.setLayout(null);
		jp2.setOpaque(true);
		jp2.setBackground(Color.gray);
		jp2.setBorder(new CompoundBorder(
			    BorderFactory.createMatteBorder(1, 1, 1, 1, Color.pink), 
			    BorderFactory.createMatteBorder(1, 1, 1, 1, Color.pink)));
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/p1.jpg")).getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/p1.jpg")).getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		jl3=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/contact.jpg")).getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/contact.jpg")).getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

		jt1=new JTextField();
		jt2=new JTextField();
		jt3=new JTextField();
		jt4=new JTextField();

		jl0=new JLabel("Team Details");
		jp2.add(jl0);
		jp2.add(jl1);
		jp2.add(jl2);
		jp2.add(jl4);
		jp2.add(jl3);
		jp2.add(jt1);
		jp2.add(jt2);
		jp2.add(jt3);
		jp2.add(jt4);
		
		jl0.setBounds(540, 0, 300, 20);
		jl0.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
		jl0.setForeground(Color.WHITE);
		
		jl1.setBounds(20, 30, 50, 50);jt1.setBounds(130, 30, 600, 50);jl3.setBounds(830, 30, 70, 70);jt3.setBounds(940, 30, 350, 50);
		jl2.setBounds(20, 90, 50, 50);jt2.setBounds(130, 90, 600, 50);jl4.setBounds(830, 90, 70, 70);jt4.setBounds(940, 90, 350, 50);
		jt1.setBorder(null);jt2.setBorder(null);jt3.setBorder(null);jt4.setBorder(null);
		
		jp3=new JPanel();
		jp3.setBounds(0,250, 1380, 510);
		jp3.setOpaque(true);
		jp3.setBackground(Color.PINK);
		jp3.setLayout(null);
                
                
               
		
		jl6=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/instruct.png")).getScaledInstance(1380, 510, Image.SCALE_SMOOTH)));
                jl6.setBounds(0,0,1380,510);
		JButton jl14=new JButton(new ImageIcon(ImageIO.read(new File("karan1/images (1).png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
                jl14.setBounds(2000,0,70,70);
		jl14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t=jt1.getText()+"   :    "+jt3.getText()+"   :    "+jt2.getText()+"    :   "+jt4.getText();
					
					fs.write(t.getBytes());
					fs.write('\n');
					fs.close();
					jl14.setEnabled(false);
					jf.setVisible(false);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                                
                            
		
			
				try {
                                        hint=0;
                                        for(int i=0;i<20;i++)
                                        {
                                            status[i]=1;
                                        }
                              
	                               
					new q1(hint,status);
				} catch (IOException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		jp3.add(jl6);
		
		jp1.add(jl14);

		jl1.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		jl2.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		jl1.setOpaque(true);jl1.setBackground(new Color(250,128,114));
		jl2.setOpaque(true);jl2.setBackground(new Color(250,128,114));
		jl3.setOpaque(true);jl3.setBackground(new Color(250,128,114));
		jl4.setOpaque(true);jl4.setBackground(new Color(250,128,114));
		jl2.setForeground(Color.WHITE);
		jl1.setForeground(Color.WHITE);
		jt1.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		jt2.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		jt3.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		jt4.setFont(new Font("Comic Sans MS", Font.BOLD, 40));

		jf.add(jp1);
		jf.add(jp2);
		jf.add(jp3);
		jf.setVisible(true);
	}
       
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
              
		new Encarta();
                

	}

}









 class q1 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q1(int y,int[] z) throws IOException {
		// marks=new Integer(x);
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf1=new JFrame("PICK-A-PIC");
		Encarta.jf1.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl5;
		JButton jb1,jb2,jb3,jb4,jb10, jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
		  
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/pea.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/cock.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 1");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle2.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		jl5=new JLabel("BIRD");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		
                // FOR TIMER
                Encarta.Running1=0;
		Encarta.hrs= new JLabel();
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
                
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		jb4=new JButton(" MARKS");
                jb10=new JButton(" SUBMIT");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb4.setBounds(220,480, 150,60);
                jb10.setBounds(1000,600, 150,60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
                jb10.setOpaque(true);
		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
		
		
                    jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
                
                
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jt);
                jp1.add(jb10);
		
                jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
                jbq1.setVisible(false);
                
                 for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
               
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running1=1;
                                        status[0]=0;
					new q1(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q2(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q3(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q4(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q5(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q6(hint,status);
                                    Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q7(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q8(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q9(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q10(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q11(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q12(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q13(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q14(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q15(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q16(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q17(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q18(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q19(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running1=1;
                                    status[0]=0;
					new q20(hint,status);
					Encarta.jf1.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
                
                
                
                
                
                
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
                                if( hint>=5)
                                {
                                   JOptionPane.showConfirmDialog(new JFrame()," No more hints..","OOPS!!", JOptionPane.PLAIN_MESSAGE); 
                                }
                                else
                                {
				hint++;
				Encarta.marks=Encarta.marks - 2;
				JOptionPane.showConfirmDialog(new JFrame(), "National Bird", "HINT", JOptionPane.PLAIN_MESSAGE);
                                }
				
			}
		});
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
                            

				JOptionPane.showConfirmDialog(new JFrame(), "   This will be your FINAL SUBMISSION", " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf1.setVisible(false);
                                FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks +"   : MIN : "+Encarta.m +"   : SEC : "+Encarta.s;
					fs.write(t.getBytes());
                                        String s="\n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                                System.exit(0);
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
                
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("peacock"))
				{
                                  
				status[0]=0;	
				Encarta.marks=Encarta.marks + 3;
				try {Encarta.Running1=1;
                                        if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Encarta.jf1.setVisible(false);
				}
                                else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
                                    
			}
		});
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(new JFrame(), "marks are"+ Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		Encarta.jf1.add(jp1);
		Encarta.jf1.setVisible(true);
		
	}

}
 



 class q2 extends TimeLimit implements Runnable {
 Integer hint;
 int[] status;

 	public q2(int y,int[] z) throws IOException {
         
 		//marks=new Integer(x);
                Encarta.correct++;
 		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
 		Encarta.jf2=new JFrame("PICK-A-PIC");
 		Encarta.jf2.setSize(1380, 720);
 		JPanel jp1=new JPanel();
 		jp1.setBounds(0, 0, 1380, 720);
 		jp1.setOpaque(true);
 		
 		jp1.setBackground(Color.white);
 		
 		JLabel jl1,jl2,jl3,jl4;
 		JButton jb1,jb2,jb3,jb4,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
 		JTextField jt=new JTextField();
 		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf2.setVisible(false);
                                 FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks +"   : MIN : "+Encarta.m +"   : SEC : "+Encarta.s;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                                
                                System.exit(0);
			}
		});
 		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/dumble.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
 		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/door.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
 		jl3=new JLabel("QUES 2");
 		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle2.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
 		jl1.setBounds(200, 100, 250, 250);
 		jl2.setBounds(480, 100, 250, 250);
 		jl3.setBounds(550, 0, 280, 60);
 		jl4.setBounds(760, 100, 400, 400);
 		jt.setBounds(200, 400, 530, 60);
 		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
 		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
 		
 		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
 		jb2=new JButton("ANSWER");
 		jb3=new JButton("CLEAR");
 		jb4=new JButton("MARKS");
 		jb4.setBounds(220,480,150,60);
 		jb4.setOpaque(true);
 		jb4.setBackground(new Color(59,59,189));
 		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb4.setForeground(Color.white);
 		jp1.add(jb4);
 		jb4.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				// TODO Auto-generated method stub
 				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
 			}
 		});
 		
 		jb1.setBounds(80, 380, 70, 70);
 		jb3.setBounds(400, 480, 150, 60);
 		jb2.setBounds(580, 480, 150, 60);
 		jb2.setOpaque(true);
 		jb2.setBackground(new Color(59,59,189));
 		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb2.setForeground(Color.white);
 		jb3.setOpaque(true);
 		jb3.setBackground(new Color(59,59,189));
 		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb3.setForeground(Color.white);
 		JLabel jl5=new JLabel("Fictional movie character");
 		jl5.setBounds(200, 350, 530, 50);
 		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jl5.setForeground(Color.white);
 		jp1.add(jl5);
 		
                 // FOR TIMER
                 Encarta.Running2=0;
		Encarta.hrs= new JLabel();
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
                  
 		jp1.setLayout(null);
 		jp1.setOpaque(true);
 		jp1.setBackground(new Color(255,160,122));
 		jp1.add(jl1);
 		jp1.add(jl2);
 		jp1.add(jl3);
 		jp1.add(jl4);
 		jp1.add(jb1);
 		jp1.add(jb2);
 		jp1.add(jb3);
 		jp1.add(jt);
                
                   jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                jbq2.setVisible(false);
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running2=1;    status[1]=0;
					new q1(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running2=1;    status[1]=0;
					new q2(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q3(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q4(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    status[1]=0;
					new q5(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    status[1]=0;
                                    
					new q6(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q7(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q8(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q9(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q10(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q11(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q12(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q13(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q14(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q15(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q16(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q17(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q18(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q19(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running2=1;    
                                    status[1]=0;
					new q20(hint,status);
					Encarta.jf2.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
                
 		jb1.addActionListener(new ActionListener() {
 			
 		
 			public void actionPerformed(ActionEvent arg0) {
 				if(hint>=5)
 					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
 				else
 				{
 				hint++;
 				Encarta.marks=Encarta.marks-2;
 				JOptionPane.showConfirmDialog(new JFrame(), "A fictional character in J. K. Rowling's series.", "HINT", JOptionPane.PLAIN_MESSAGE);
 				}
 				
 				
 			}
 		});
 		jb3.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				jt.setText("");
 				
 			}
 		});
 		jb2.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				if(jt.getText().equalsIgnoreCase("dumbledore") || jt.getText().equalsIgnoreCase("albus dumbledore"))
 				{
 				status[1]=0;	
 				Encarta.marks=Encarta.marks+3;
                                
 			try {
                             
 				  Encarta.Running2=1;
                                         if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else
                                        {
                                            if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
 			} catch (IOException e1) {
 				// TODO Auto-generated catch block
 				e1.printStackTrace();
 			}
 				Encarta.jf2.setVisible(false);
 				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
 			
 			}
 		});
 		
 		Encarta.jf2.add(jp1);
 		Encarta.jf2.setVisible(true);
 		
 	}

 }



 class q3 extends TimeLimit implements Runnable{
Integer hint;
int[] status;

	public q3(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++;  
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf3=new JFrame("PICK-A-PIC");
		Encarta.jf3.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
                JButton jb1,jb2,jb3,jb4,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
                
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf3.setVisible(false);
                                 FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/bread.png")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/pitt.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 3");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle2.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		JLabel jl5=new JLabel(" Actor ");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
                 jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running3=0; 
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
                
                
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                jbq2.setVisible(false);
                   jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		jbq3.setVisible(false);
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running3=1;    
                                    status[2]=0;
					new q1(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q2(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q3(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q4(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q5(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q6(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q7(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q8(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q9(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q10(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q11(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q12(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q13(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q14(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q15(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q16(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q17(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q18(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q19(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running3=1;    
                                     status[2]=0;
					new q20(hint,status);
					Encarta.jf3.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
             
                
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "American actor and producer", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("brad pitt")||(jt.getText().equalsIgnoreCase("bradpitt")))
				{
				status[2]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try {
                                  
                                       Encarta.Running3=1;
                                        if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf3.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			}
		});
		
		Encarta.jf3.add(jp1);
		Encarta.jf3.setVisible(true);
		
	}

}





 class q4 extends TimeLimit implements Runnable{
Integer hint;
int[] status;

	public q4(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf4=new JFrame("PICK-A-PIC");
		Encarta.jf4.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jb4,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf4.setVisible(false);
                                 FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                                
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/mother.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/board.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 4");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle2.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		JLabel jl5=new JLabel("Computer hardware");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running4=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
                jbq4.setVisible(false);
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running4=1;    
                                     status[3]=0;
					new q1(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running4=1;    
                                    status[3]=0;
					new q2(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    
                                    status[3]=0;
					new q3(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    
                                    status[3]=0;
					new q4(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q5(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q6(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q7(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q8(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q9(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q10(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q11(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q12(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q13(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q14(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q15(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q16(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q17(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q18(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q19(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running4=1;    status[3]=0;
					new q20(hint,status);
					Encarta.jf4.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Circuit board (PCB) found in computers", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("motherboard"))
				{
				status[3]=0;	
				Encarta.marks=Encarta.marks+3;
                               
			try {
                                        Encarta.Running4=1;
                                        if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else
                                        {   if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showMessageDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf4.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf4.add(jp1);
		Encarta.jf4.setVisible(true);
		
	}

}
 
 
 
 


class q5 extends TimeLimit implements Runnable{
 Integer hint;
 int[] status;

 	public q5(int y,int[] z) throws IOException {
 		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
 		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
 		Encarta.jf5=new JFrame("PICK-A-PIC");
 		Encarta.jf5.setSize(1380, 720);
 		JPanel jp1=new JPanel();
 		jp1.setBounds(0, 0, 1380, 720);
 		jp1.setOpaque(true);
 		
 		jp1.setBackground(Color.white);
 		
 		JLabel jl1,jl2,jl3,jl4;
 		JButton jb1,jb2,jb3,jb4,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
 		JTextField jt=new JTextField();
 		
 		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf5.setVisible(false);
                                 FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                            
                                System.exit(0);
			}
		});
                
 		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/gram.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
 		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/bell.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
 		jl3=new JLabel("QUES 5");
 		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle2.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
 		jl1.setBounds(200, 100, 250, 250);
 		jl2.setBounds(480, 100, 250, 250);
 		jl3.setBounds(550, 0, 280, 60);
 		jl4.setBounds(760, 100, 400, 400);
 		jt.setBounds(200, 400, 530, 60);
 		JLabel jl5=new JLabel("Inventor");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
 		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
 		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
 		
 		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
 		jb2=new JButton("ANSWER");
 		jb3=new JButton("CLEAR");
 		
 		jb1.setBounds(80, 380, 70, 70);
 		jb3.setBounds(400, 480, 150, 60);
 		jb2.setBounds(580, 480, 150, 60);
 		jb2.setOpaque(true);
 		jb2.setBackground(new Color(59,59,189));
 		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb2.setForeground(Color.white);
 		jb3.setOpaque(true);
 		jb3.setBackground(new Color(59,59,189));
 		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb3.setForeground(Color.white);
 		 jb4=new JButton("MARKS");
 		jb4.setBounds(220,480,150,60);
 		jb4.setOpaque(true);
 		jb4.setBackground(new Color(59,59,189));
 		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
 		jb4.setForeground(Color.white);
 		jp1.add(jb4);
 		jb4.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				// TODO Auto-generated method stub
 				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
 			}
 		});
 		
 		
 		jp1.setLayout(null);
 		jp1.setOpaque(true);
 		jp1.setBackground(new Color(255,160,122));
 		jp1.add(jl1);
 		jp1.add(jl2);
 		jp1.add(jl3);
 		jp1.add(jl4);
 		jp1.add(jb1);
 		jp1.add(jb2);
 		jp1.add(jb3);
 		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq5.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
                
               // jbq5.setVisible(false);
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running5=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running5=1;    status[4]=0;
					new q1(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running5=1;    
                                    status[4]=0;
					new q2(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q3(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q4(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q5(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q6(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q7(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q8(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q9(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q10(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q11(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q12(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q13(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q14(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q15(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q16(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q17(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q18(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q19(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running5=1;    status[4]=0;
					new q20(hint,status);
					Encarta.jf5.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
 		
 		jb1.addActionListener(new ActionListener() {
 			
 		
 			public void actionPerformed(ActionEvent arg0) {
 				if(hint>=5)
 					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
 				else
 				{
 				hint++;
 				Encarta.marks=Encarta.marks-2;
 				JOptionPane.showConfirmDialog(new JFrame(), "He is widely credited with the invention of the first practical telephone.", "HINT", JOptionPane.PLAIN_MESSAGE);
 				}
 				
 				
 			}
 		});
 		jb3.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				jt.setText("");
 				
 			}
 		});
 		jb2.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				if(jt.getText().equalsIgnoreCase("alexander graham bell")|| jt.getText().equalsIgnoreCase("alexandergrahambell"))
 				{
 				status[4]=0;	
 				Encarta.marks=Encarta.marks+3;
                               
 			try {
				  Encarta.Running5=1;
                                        if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else
                                        {   if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                        System.exit(0);  }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
 				Encarta.jf5.setVisible(false);
 				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
 			}
 		});
 		
 		Encarta.jf5.add(jp1);
 		Encarta.jf5.setVisible(true);
 		
 	}

 }

 class q6 extends TimeLimit implements Runnable {
Integer hint;
int[] status;
	public q6(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf6=new JFrame("PICK-A-PIC");
		Encarta.jf6.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf6.setVisible(false);
                                 FileOutputStream fs;
				try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/you.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/tube.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 6");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle3.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		
		JLabel jl5=new JLabel("Website");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               jbq6.setVisible(false);
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running6=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q1(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q2(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q3(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q4(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q5(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q6(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q7(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q8(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q9(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q10(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q11(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q12(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q13(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q14(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    	status[5]=0;			
					new q15(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q16(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    
                                    status[5]=0;
					new q17(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q18(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q19(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running6=1;    status[5]=0;
					new q20(hint,status);
					Encarta.jf6.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Video sharing website", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("youtube") )
				{
				status[5]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try {
				 Encarta.Running6=1;
                                         if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                        System.exit(0);  }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf6.setVisible(false);
				}
			
			}
		});
		
		Encarta.jf6.add(jp1);
		Encarta.jf6.setVisible(true);
		
	}

}




 class q7 extends TimeLimit implements Runnable{
Integer hint;
int[] status;

	public q7(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf7=new JFrame("PICK-A-PIC");
		Encarta.jf7.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf7.setVisible(false);
                                FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/cold.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/play.png")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 7");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle3.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		JLabel jl5=new JLabel("Car");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running7=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq7.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q1(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q2(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q3(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q4(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q5(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q6(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q7(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    
                                    status[6]=0;
					new q8(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q9(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q10(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q11(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q12(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q13(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q14(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q15(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q16(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q17(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q18(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q19(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running7=1;    status[6]=0;
					new q20(hint,status);
					Encarta.jf7.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Recently performed live at the Global Citizen Festival, Mumbai", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("COLDPLAY"))
				{
				status[6]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try {
				  Encarta.Running7=1;
                                         if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf7.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf7.add(jp1);
		Encarta.jf7.setVisible(true);
		
	}

}





class q8 extends TimeLimit implements Runnable {
Integer hint;
int[] status;
	public q8(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf8=new JFrame("PICK-A-PIC");
		Encarta.jf8.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf8.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/micro.png")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/soft.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 8");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle3.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		JLabel jl5=new JLabel("Computer Software");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running8=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq8.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running8=1;    
                                    status[7]=0;
					new q1(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q2(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q3(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q4(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q5(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q6(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q7(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q8(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q9(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q10(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q11(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q12(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q13(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q14(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q15(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q16(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q17(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q18(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running8=1;    
                                     status[7]=0;
					new q19(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {Encarta.Running8=1;
                                     status[7]=0;
					new q20(hint,status);
					Encarta.jf8.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "M _ _ R _   S _ _ T", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("microsoft"))
				{
				status[7]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try {
				 Encarta.Running8=1;
                                       if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf8.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf8.add(jp1);
		Encarta.jf8.setVisible(true);
		
	}

}


class q9  extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q9(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf9=new JFrame("PICK-A-PIC");
		Encarta.jf9.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf9.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/snap.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/deal.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 9");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle3.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200, 400, 530, 60);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		JLabel jl5=new JLabel("Website");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running9=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                
               jbq9.setVisible(false);
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running9=1;     status[8]=0;
					new q1(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q2(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q3(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q4(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q5(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q6(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q7(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q8(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q9(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q10(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q11(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q12(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q13(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q14(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    
                                    status[8]=0;
					new q15(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q16(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q17(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q18(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q19(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running9=1;    status[8]=0;
					new q20(hint,status);
					Encarta.jf9.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Online shopping site", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("snapdeal"))
				{
				status[8]=0;	
				Encarta.marks=Encarta.marks+3;
                                 
				
                                try{Encarta.Running9=1;
                                        if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                         else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else
                                        {   if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf9.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf9.add(jp1);
		Encarta.jf9.setVisible(true);
		
	}

}


class q10  extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q10(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf10=new JFrame("PICK-A-PIC");
		Encarta.jf10.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl14;
		JButton jb1,jb2,jb3,jb4,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf10.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/sydney.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/shell.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/don.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 10");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle3.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200, 380, 530, 70);
		JLabel jl5=new JLabel("Writer");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running10=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
                jp1.add(jl14);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq10.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running10=1;    
                                    status[9]=0;
					new q1(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q2(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q3(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q4(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q5(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q6(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q7(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q8(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q9(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q10(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q11(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q12(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q13(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q14(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q15(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q16(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q17(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q18(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q19(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running10=1;    status[9]=0;
					new q20(hint,status);
					Encarta.jf10.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "American writer and producer", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("sidney sheldon")||jt.getText().equalsIgnoreCase("sidneysheldon") )
				{
				status[9]=0;	
				Encarta.marks=Encarta.marks+3;
                                  
			try{  Encarta.Running10=1;    
				  
                                        if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else
                                        {   if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf10.setVisible(false);
				}
                                  else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf10.add(jp1);
		Encarta.jf10.setVisible(true);
		
	}

}


class q11 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q11(int y ,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf11=new JFrame("PICK-A-PIC");
		Encarta.jf11.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf11.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running11=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/opera.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/mini.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES 11");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle4.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Web browser");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq11.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running11=1;    status[10]=0;
					new q1(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q2(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q3(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q4(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q5(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q6(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q7(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q8(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q9(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q10(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q11(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q12(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q13(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q14(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q15(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q16(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q17(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q18(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q19(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running11=1;    status[10]=0;
					new q20(hint,status);
					Encarta.jf11.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "One of the world's most popular web browser that works on almost any phone", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("operamini")||jt.getText().equalsIgnoreCase("opera mini") )
				{
				status[10]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try{  Encarta.Running11=1;    
				  
                                        if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else
                                        {   if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf11.setVisible(false);
				}
                                  else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			}
		});
		
		Encarta.jf11.add(jp1);
		Encarta.jf11.setVisible(true);
		
	}

}

class q12 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
        public q12(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf12=new JFrame("PICK-A-PIC");
		Encarta.jf12.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl14;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf12.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/red.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/hat.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                //jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/herd.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES12");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle4.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                //jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Software Company");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running12=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
               // jp1.add(jl14);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq12.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running12=1;    status[11]=0;
					new q1(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q2(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q3(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q4(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q5(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q6(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q7(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q8(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q9(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q10(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q11(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q12(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q13(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q14(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q15(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q16(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q17(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q18(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q19(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running12=1;    status[11]=0;
					new q20(hint,status);
					Encarta.jf12.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Software company providing open-source software products to the enterprise community.", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("red hat")||jt.getText().equalsIgnoreCase("redhat") )
				{
				status[11]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try{  Encarta.Running12=1;    
				  
                                        if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf12.setVisible(false);
				}
                                
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			}
		});
		
		Encarta.jf12.add(jp1);
		Encarta.jf12.setVisible(true);
		
	}

}


class q13 extends TimeLimit implements Runnable{
Integer hint;
int[] status;

	public q13(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                         {
                             status[i]=z[i];
                         }
                 Encarta.jf13=new JFrame("PICK-A-PIC");
		Encarta.jf13.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running13=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		JLabel jl1,jl2,jl3,jl4,jl14;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf13.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/opera.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/win.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/free.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES13");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle4.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("International talk show host");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
                jp1.add(jl14);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq13.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running13=1;    
                                    status[12]=0;
					new q1(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q2(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q3(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q4(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q5(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q6(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q7(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q8(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    
                                    status[12]=0;
					new q9(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    
                                    status[12]=0;
					new q10(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q11(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q12(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q13(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q14(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q15(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q16(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q17(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q18(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q19(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running13=1;    status[12]=0;
					new q20(hint,status);
					Encarta.jf13.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "O _ R _ H      _ _ N _ R _ Y", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("oprah winfrey")||jt.getText().equalsIgnoreCase("oprahwinfrey") )
				{
				status[12]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try{  Encarta.Running13=1;    
				  
                                        if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf13.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			}
		});
		
		Encarta.jf13.add(jp1);
		Encarta.jf13.setVisible(true);
		
	}

}


class q14 extends TimeLimit implements Runnable{
Integer hint;
int[] status;

	public q14(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		 Encarta.jf14=new JFrame("PICK-A-PIC");
		Encarta.jf14.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running14=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		JLabel jl1,jl2,jl3,jl14,jl4;
                JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf14.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/rani.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/laxmi.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/bai.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES14");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle4.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("HISTORICAL PERSONALITY");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
                jp1.add(jl14);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq14.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running14=1;    
                                    status[13]=0;
					new q1(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running14=1;    
                                    status[13]=0;
					new q2(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q3(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q4(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q5(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q6(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q7(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q8(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q9(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q10(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q11(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q12(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q13(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q14(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q15(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q16(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q17(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q18(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q19(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running14=1;    status[13]=0;
					new q20(hint,status);
					Encarta.jf14.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Known as Jhansi ki Rani", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("RaniLakshmibai")||jt.getText().equalsIgnoreCase("Rani Lakshmi bai") ||jt.getText().equalsIgnoreCase("Rani Lakshmi bai"))
				{
				status[13]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try{  Encarta.Running14=1;    
				 
                                        if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else  if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf14.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			}
		});
		
		Encarta.jf14.add(jp1);
		Encarta.jf14.setVisible(true);
		
	}

}


class q15 extends TimeLimit implements Runnable {
Integer hint;
int[] status;
	public q15(int y,int[] z) throws IOException {
            Encarta.correct++; 
		//Encarta.marks=new Integer(x);
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf15=new JFrame("PICK-A-PIC");
		Encarta.jf15.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl14;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running15=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf15.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/the.png")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/lord.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/ring.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES15");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle4.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Movie Series");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
                jp1.add(jl14);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   jbq15.setVisible(false);
                
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running15=1;    status[14]=0;
					new q1(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q2(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q3(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q4(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q5(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q6(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q7(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q8(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q9(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q10(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q11(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q12(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q13(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q14(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q15(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q16(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q17(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q18(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q19(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running15=1;    status[14]=0;
					new q20(hint,status);
					Encarta.jf15.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Directed by Peter Jackson", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("The lord of the rings")||jt.getText().equalsIgnoreCase("Thelordoftherings") )
				{
				status[14]=0;	
				Encarta.marks=Encarta.marks+3;
                               
			try{  Encarta.Running15=1;    
				  
                                        if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf15.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf15.add(jp1);
		Encarta.jf15.setVisible(true);
		
	}

}


class q16 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q16(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf16=new JFrame("PICK-A-PIC");
		Encarta.jf16.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl14;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running16=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf16.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/microscope.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/wave.jpg")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                //jl14=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/man.png")).getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES16");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle5.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(60, 100, 200, 200);
		jl2.setBounds(280, 100, 200, 200);
                //jl14.setBounds(500, 100, 200, 200);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(750, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Form of electromagnetic radiation");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
                //jp1.add(jl14);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq16.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running16=1;    status[15]=0;
					new q1(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q2(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q3(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q4(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q5(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q6(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q7(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q8(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q9(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q10(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q11(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q12(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q13(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q14(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q15(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q16(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q17(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q18(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q19(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running16=1;    status[15]=0;
					new q20(hint,status);
					Encarta.jf16.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "M _ _ R _ W _ V _", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("microwave"))
				{
				status[15]=0;	
				Encarta.marks=Encarta.marks+3;
                                       
			try{  Encarta.Running16=1;    
				  
                                        if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                         System.exit(0); }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf16.setVisible(false);
				}
                                else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf16.add(jp1);
		Encarta.jf16.setVisible(true);
		
	}

}

 class q17 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q17(int y,int[] z) throws IOException {
            Encarta.correct++; 
		//Encarta.marks=new Integer(x);
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
               
                 }
		 Encarta.jf17=new JFrame("PICK-A-PIC");
		Encarta.jf17.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4,jl5;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
		
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running17=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/Black.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/berry.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES17");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle5.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		//jl5=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/lt3.jpg")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));

		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(730, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl6=new JLabel("Mobile");
		jl6.setBounds(200, 350, 530, 50);
		jl6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl6.setForeground(Color.white);
		jp1.add(jl6);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf17.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq17.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running17=1;    status[16]=0;
					new q1(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running17=1;    
                                    status[16]=0;
					new q2(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q3(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q4(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q5(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q6(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q7(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q8(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q9(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q10(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q11(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q12(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q13(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q14(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q15(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q16(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q17(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q18(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q19(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running17=1;    status[16]=0;
					new q20(hint,status);
					Encarta.jf17.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "First word is black", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("blackberry")||jt.getText().equalsIgnoreCase("black berry") )
				{
				status[16]=0;	
				Encarta.marks=Encarta.marks+3;
                                     
			try{  Encarta.Running17=1;    
				  
                                        if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf17.setVisible(false);
				}
                                else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf17.add(jp1);
		Encarta.jf17.setVisible(true);
		
	}

}


class q18 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q18(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf18=new JFrame("PICK-A-PIC");
		Encarta.jf18.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/camel.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/case.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES18");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle5.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Naming convention");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running18=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf18.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq18.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running18=1;    status[17]=0;
					new q1(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q2(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q3(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q4(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q5(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q6(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q7(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q8(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q9(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q10(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q11(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q12(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q13(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q14(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q15(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q16(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q17(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q18(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q19(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running18=1;    status[17]=0;
					new q20(hint,status);
					Encarta.jf18.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "A name is formed of multiple words that are joined together as a single word with the first letter of each of the multiple words capitalized so that each word that makes up the name can easily be read", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("camelcase") || jt.getText().equalsIgnoreCase("camel case"))
				{
				status[17]=0;	
				Encarta.marks=Encarta.marks+3;
                                  
			try{  Encarta.Running18=1;    
				  
                                        if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                          System.exit(0);}}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf18.setVisible(false);
				}
                                 else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf18.add(jp1);
		Encarta.jf18.setVisible(true);
		
	}

}


class q19 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q19(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                Encarta.correct++; 
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
		Encarta.jf19=new JFrame("PICK-A-PIC");
		Encarta.jf19.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
		
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running19=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/dot.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/matrix.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("QUES19");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle5.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Printer");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf19.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
                                
			}
		});
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
		
                
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq19.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running19=1;      status[18]=0;
					new q1(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q2(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q3(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q4(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q5(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q6(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q7(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q8(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q9(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q10(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q11(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q12(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q13(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q14(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q15(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q16(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q17(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q18(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q19(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running19=1;      status[18]=0;
					new q20(hint,status);
					Encarta.jf19.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "A grid of dots which are filled selectively to produce an image on a screen or paper.", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("dotmatrix") || jt.getText().equalsIgnoreCase("dot matrix"))
				{
				status[18]=0;	
				Encarta.marks=Encarta.marks+3;
                                
			try{  Encarta.Running19=1;    
				  
                                        if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else
                                        {if(Encarta.correct==20){
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it", "OMG!!!!", JOptionPane.PLAIN_MESSAGE);
                                            JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " FINAL SCORE ", JOptionPane.PLAIN_MESSAGE);
                                              System.exit(0);
                                        }}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf19.setVisible(false);
				}
                                else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                }
			
			}
		});
		
		Encarta.jf19.add(jp1);
		Encarta.jf19.setVisible(true);
		
	}

}


class q20 extends TimeLimit implements Runnable{
Integer hint;
int[] status;
	public q20(int y,int[] z) throws IOException {
		//Encarta.marks=new Integer(x);
                 Encarta.correct++;
		 hint=new Integer(y);
                 status=new int[20];
                 for(int i=0;i<20;i++)
                 {
                     status[i]=z[i];
                 }
                 Encarta.jf20=new JFrame("PICK-A-PIC");
		Encarta.jf20.setSize(1380, 720);
		JPanel jp1=new JPanel();
		jp1.setBounds(0, 0, 1380, 720);
		jp1.setOpaque(true);
		
		jp1.setBackground(Color.white);
		
		JLabel jl1,jl2,jl3,jl4;
		JButton jb1,jb2,jb3,jbq1,jbq2,jbq3,jbq4,jbq5,jbq6,jbq7,jbq8,jbq9,jbq10,jbq11,jbq12,jbq13,jbq14,jbq15,jbq16,jbq17,jbq18,jbq19,jbq20;
		JTextField jt=new JTextField();
		
                
                 // FOR TIMER
                
		Encarta.hrs= new JLabel(); Encarta.Running20=0;
                Encarta.min= new JLabel();
                Encarta.sec= new JLabel();
                Encarta.time= new JLabel();
                Encarta.time.setText("Time :");
                Encarta.hrs.setText("0"+" : ");
                Encarta.min.setText("0"+" : ");
                Encarta.sec.setText("0"+" ");
                Encarta.time.setBounds(10, 0, 80, 60);
                Encarta.hrs.setBounds(100, 0, 60, 60);
                Encarta.min.setBounds(170, 0, 60, 60);
                Encarta.sec.setBounds(240, 0, 60, 60);
                jp1.add(Encarta.time);
                jp1.add(Encarta.hrs);
                jp1.add(Encarta.min);
                jp1.add(Encarta.sec);
		Thread tt=new Thread(this);
                tt.start();
                
		
		jl1=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/jim.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl2=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/whale.jpg")).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
		jl3=new JLabel("FINAL QUE");
		jl4=new JLabel(new ImageIcon(ImageIO.read(new File("karan1/puzzle5.png")).getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		jl1.setBounds(200, 100, 250, 250);
		jl2.setBounds(480, 100, 250, 250);
		jl3.setBounds(550, 0, 280, 60);
		jl4.setBounds(760, 100, 400, 400);
		jt.setBounds(200,400, 530, 60);
		JLabel jl5=new JLabel("Internet entrepreneur");
		jl5.setBounds(200, 350, 530, 50);
		jl5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jl5.setForeground(Color.white);
		jp1.add(jl5);
		jt.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		jl3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		
		jb1=new JButton(new ImageIcon(ImageIO.read(new File("karan1/hint.png")).getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
		jb2=new JButton("ANSWER");
		jb3=new JButton("CLEAR");
		JButton jb10;
                jb10=new JButton("SUBMIT");
 		jb10.setBounds(1000,600,150,60);
 		jb10.setBackground(new Color(59,59,189));
		jb10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb10.setForeground(Color.white);
                jp1.add(jb10);
                jb10.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showConfirmDialog(new JFrame(), "FINAL SUBMISSION", "SUBMIT", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showConfirmDialog(new JFrame(), "Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , " SUBMIT", JOptionPane.PLAIN_MESSAGE);
				Encarta.jf20.setVisible(false);
                                 FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks;
					fs.write(t.getBytes());
                                        String s="/n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                                System.exit(0);
			}
		});
		jb1.setBounds(80, 380, 70, 70);
		jb3.setBounds(400, 480, 150, 60);
		jb2.setBounds(580, 480, 150, 60);
		jb2.setOpaque(true);
		jb2.setBackground(new Color(59,59,189));
		jb2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb2.setForeground(Color.white);
		jb3.setOpaque(true);
		jb3.setBackground(new Color(59,59,189));
		jb3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb3.setForeground(Color.white);
		JButton jb4=new JButton("MARKS");
		jb4.setBounds(220,480,150,60);
		jb4.setOpaque(true);
		jb4.setBackground(new Color(59,59,189));
		jb4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jb4.setForeground(Color.white);
		jp1.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(new JFrame(), "your Encarta.marks are  "+Encarta.marks, "MARKS", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		
		jp1.setLayout(null);
		jp1.setOpaque(true);
		jp1.setBackground(new Color(255,160,122));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jt);
                 jbq1 = new JButton("Q1");
                    jbq1.setBackground(new Color(59,59,189));
		    jbq1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq1.setForeground(Color.white);
                    jbq1.setOpaque(true);
                    jbq2 = new JButton("Q2");
                    jbq2.setBackground(new Color(59,59,189));
		    jbq2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq2.setForeground(Color.white);
                    jbq2.setOpaque(true);
                     jbq3 = new JButton("Q3");
                    jbq3.setBackground(new Color(59,59,189));
		    jbq3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq3.setForeground(Color.white);
                    jbq3.setOpaque(true);
                     jbq4 = new JButton("Q4");
                    jbq4.setBackground(new Color(59,59,189));
		    jbq4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq4.setForeground(Color.white);
                    jbq4.setOpaque(true);
                     jbq5 = new JButton("Q5");
                    jbq5.setBackground(new Color(59,59,189));
		    jbq5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq5.setForeground(Color.white);
                    jbq5.setOpaque(true);
                     jbq6 = new JButton("Q6");
                    jbq6.setBackground(new Color(59,59,189));
		    jbq6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq6.setForeground(Color.white);
                    jbq6.setOpaque(true);
                     jbq7 = new JButton("Q7");
                    jbq7.setBackground(new Color(59,59,189));
		    jbq7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq7.setForeground(Color.white);
                    jbq7.setOpaque(true);
                     jbq8 = new JButton("Q8");
                    jbq8.setBackground(new Color(59,59,189));
		    jbq8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq8.setForeground(Color.white);
                    jbq8.setOpaque(true);
                     jbq9 = new JButton("Q9");
                    jbq9.setBackground(new Color(59,59,189));
		    jbq9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq9.setForeground(Color.white);
                    jbq9.setOpaque(true);
                     jbq10 = new JButton("Q10");
                    jbq10.setBackground(new Color(59,59,189));
		    jbq10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq10.setForeground(Color.white);
                    jbq10.setOpaque(true);
                     jbq11 = new JButton("Q11");
                    jbq11.setBackground(new Color(59,59,189));
		    jbq11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq11.setForeground(Color.white);
                    jbq11.setOpaque(true);
                     jbq12 = new JButton("Q12");
                    jbq12.setBackground(new Color(59,59,189));
		    jbq12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq12.setForeground(Color.white);
                    jbq12.setOpaque(true);
                     jbq13 = new JButton("Q13");
                    jbq13.setBackground(new Color(59,59,189));
		    jbq13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq13.setForeground(Color.white);
                    jbq13.setOpaque(true);
                     jbq14 = new JButton("Q14");
                    jbq14.setBackground(new Color(59,59,189));
		    jbq14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq14.setForeground(Color.white);
                    jbq14.setOpaque(true);
                     jbq15 = new JButton("Q15");
                    jbq15.setBackground(new Color(59,59,189));
		    jbq15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq15.setForeground(Color.white);
                    jbq15.setOpaque(true);
                     jbq16 = new JButton("Q16");
                    jbq16.setBackground(new Color(59,59,189));
		    jbq16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq16.setForeground(Color.white);
                    jbq16.setOpaque(true);
                     jbq17 = new JButton("Q17");
                    jbq17.setBackground(new Color(59,59,189));
		    jbq17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq17.setForeground(Color.white);
                    jbq17.setOpaque(true);
                     jbq18 = new JButton("Q18");
                    jbq18.setBackground(new Color(59,59,189));
		    jbq18.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq18.setForeground(Color.white);
                    jbq18.setOpaque(true);
                     jbq19 = new JButton("Q19");
                    jbq19.setBackground(new Color(59,59,189));
		    jbq19.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq19.setForeground(Color.white);
                    jbq19.setOpaque(true);
                     jbq20 = new JButton("LAST");
                    jbq20.setBackground(new Color(59,59,189));
		    jbq20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		    jbq20.setForeground(Color.white);
                    jbq20.setOpaque(true);
                   
                jbq20.setVisible(false);
               
                jbq1.setBounds(1170,40,80,40);
                jbq2.setBounds(1170,90,80,40);
                jbq3.setBounds(1170,140,80,40);
                jbq4.setBounds(1170,190,80,40);
                jbq5.setBounds(1170,240,80,40);
                jbq6.setBounds(1170,290,80,40);
                jbq7.setBounds(1170,340,80,40);
                jbq8.setBounds(1170,390,80,40);
                jbq9.setBounds(1170,440,80,40);
                jbq10.setBounds(1170,490,80,40);
                jbq11.setBounds(1260,40,80,40);
                jbq12.setBounds(1260,90,80,40);
                jbq13.setBounds(1260,140,80,40);
                jbq14.setBounds(1260,190,80,40);
                jbq15.setBounds(1260,240,80,40);
                jbq16.setBounds(1260,290,80,40);
                jbq17.setBounds(1260,340,80,40);
                jbq18.setBounds(1260,390,80,40);
                jbq19.setBounds(1260,440,80,40);
                jbq20.setBounds(1260,490,80,40);
 		
                
                 jp1.add(jbq1);
                jp1.add(jbq2);
                jp1.add(jbq3);
                jp1.add(jbq4);
                jp1.add(jbq5);
                jp1.add(jbq6);
                jp1.add(jbq7);
                jp1.add(jbq8);
                jp1.add(jbq9);
                jp1.add(jbq10);
                jp1.add(jbq11);
                jp1.add(jbq12);
                jp1.add(jbq13);
                jp1.add(jbq14);
                jp1.add(jbq15);
                jp1.add(jbq16);
                jp1.add(jbq17);
                jp1.add(jbq18);
                jp1.add(jbq19);
                jp1.add(jbq20);
 		
                for(int i=0;i<20;i++)
                {
                    if(status[0]==0)
                        jbq1.setVisible(false);
                    if(status[1]==0)
                        jbq2.setVisible(false);
                    if(status[2]==0)
                        jbq3.setVisible(false);
                    if(status[3]==0)
                        jbq4.setVisible(false);
                    if(status[4]==0)
                        jbq5.setVisible(false);
                    if(status[5]==0)
                        jbq6.setVisible(false);
                    if(status[6]==0)
                        jbq7.setVisible(false);
                    if(status[7]==0)
                        jbq8.setVisible(false);
                    if(status[8]==0)
                        jbq9.setVisible(false);
                    if(status[9]==0)
                        jbq10.setVisible(false);
                    if(status[10]==0)
                        jbq11.setVisible(false);
                    if(status[11]==0)
                        jbq12.setVisible(false);
                    if(status[12]==0)
                        jbq13.setVisible(false);
                    if(status[13]==0)
                        jbq14.setVisible(false);
                    if(status[14]==0)
                        jbq15.setVisible(false);
                    if(status[15]==0)
                        jbq16.setVisible(false);
                    if(status[16]==0)
                        jbq17.setVisible(false);
                    if(status[17]==0)
                        jbq18.setVisible(false);
                    if(status[18]==0)
                        jbq19.setVisible(false);
                    if(status[19]==0)
                        jbq20.setVisible(false);
                }
                
                
                
                jbq1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try{  Encarta.Running20=1;      status[19]=0;
					new q1(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     
			}
		});
                jbq2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                                
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q2(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
                jbq3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q3(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				    
			}
		});
                jbq4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q4(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q5(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q6(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q7(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q8(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q9(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
                jbq10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q10(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q11(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
                                    
			}
		});
                jbq12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q12(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq13.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q13(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
                jbq14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q14(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				    
			}
		});
                jbq15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q15(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q16(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
                jbq17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q17(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q18(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q19(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
			}
		});
                jbq20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{  Encarta.Running20=1;      status[19]=0;
					new q20(hint,status);
					Encarta.jf20.setVisible(false);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  
			}
		});
             
		
		jb1.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				if(hint>=5)
					JOptionPane.showConfirmDialog(new JFrame(), "no more hints", "OOPS", JOptionPane.PLAIN_MESSAGE);
				else
				{
				hint++;
				Encarta.marks=Encarta.marks-2;
				JOptionPane.showConfirmDialog(new JFrame(), "Co-founder and promoter of the online Wikipedia", "HINT", JOptionPane.PLAIN_MESSAGE);
				}
				
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jt.getText().equalsIgnoreCase("jimmywales")||jt.getText().equalsIgnoreCase("jimmy wales") )
				{
				status[19]=0;	
				Encarta.marks=Encarta.marks+3;
                                
                                try {Encarta.Running20=1;
				  if(status[0]==1)
                                            new q1(hint,status);
                                        else if(status[1]==1)
                                            new q2(hint,status);
                                        else if(status[2]==1)
                                            new q3(hint,status);
                                        else if(status[3]==1)
                                            new q4(hint,status);
                                        else if(status[4]==1)
                                            new q5(hint,status);
                                        else if(status[5]==1)
                                            new q6(hint,status);
                                        else if(status[6]==1)
                                            new q7(hint,status);
                                        else if(status[7]==1)
                                            new q8(hint,status);
                                        else if(status[8]==1)
                                            new q9(hint,status);
                                        else if(status[9]==1)
                                            new q10(hint,status);
                                        else if(status[10]==1)
                                            new q11(hint,status);
                                        else if(status[11]==1)
                                            new q12(hint,status);
                                        else if(status[12]==1)
                                            new q13(hint,status);
                                        else if(status[13]==1)
                                            new q14(hint,status);
                                        else if(status[14]==1)
                                            new q15(hint,status);
                                        else if(status[15]==1)
                                            new q16(hint,status);
                                        else if(status[16]==1)
                                            new q17(hint,status);
                                        else if(status[17]==1)
                                            new q18(hint,status);
                                        else if(status[18]==1)
                                            new q19(hint,status);
                                        else if(status[19]==1)
                                            new q20(hint,status);
                                        else
                                        { 
                                            JOptionPane.showConfirmDialog(new JFrame(), "Good! u have finished it   Your Score is :  " + Encarta.marks + "           TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , "OMG!!!!" , JOptionPane.PLAIN_MESSAGE);
                                                    System.exit(0);
                                        }
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				Encarta.jf20.setVisible(false);
				}
                                else{
                                    JOptionPane.showConfirmDialog(new JFrame(), "Wrong Answer", " ", JOptionPane.PLAIN_MESSAGE);
                                   
                                }
			
			}
		});
		
		Encarta.jf20.add(jp1);
		Encarta.jf20.setVisible(true);
		
	}

}


class TimeLimit{
     Toolkit t;
     Dimension d;
     //private volatile boolean isRunning = true;

     
     public void run()
    {   t=Toolkit.getDefaultToolkit();
        d=t.getScreenSize();
    if(Encarta.Running1==0)
    {
        while(Encarta.Running1==0 &&Encarta.flag==0)
        {
        	call();
        }
    }
        
    else if(Encarta.Running2==0)
    {
        
        while(Encarta.Running2==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
        	call();
        }
    }
    else if(Encarta.Running3==0)
    {   
        while(Encarta.Running3==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
        	call();
        }
    }
         
    else if(Encarta.Running4==0)
    {
        
        while(Encarta.Running4==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running5==0)
    {
        
        while(Encarta.Running5==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running6==0)
    {
        
        while(Encarta.Running6==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running7==0)
    {
        
        while(Encarta.Running7==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running8==0)
    {
        
        while(Encarta.Running8==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running9==0)
    {
        
        while(Encarta.Running9==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running10==0)
    {
        
        while(Encarta.Running10==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running11==0)
    {
        
        while(Encarta.Running11==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running12==0)
    {
        
        while(Encarta.Running12==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running13==0)
    {
        
        while(Encarta.Running13==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running14==0)
    {
        
        while(Encarta.Running14==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running15==0)
    {
        
        while(Encarta.Running15==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running16==0)
    {
        
        while(Encarta.Running16==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running17==0)
    {
        
        while(Encarta.Running17==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running18==0)
    {
        
        while(Encarta.Running18==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running19==0)
    {
        
        while(Encarta.Running19==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
     else if(Encarta.Running20==0)
    {
        
        while(Encarta.Running20==0 && Encarta.flag==0)  //|| Encarta.Running2==0 ||Encarta.Running3==0 ||Encarta.Running4==0 ||Encarta.Running5==0 ||Encarta.Running6==0 ||Encarta.Running7==0 ||Encarta.Running8==0 ||Encarta.Running9==0 ||Encarta.Running10==0 ||Encarta.Running11==0 ||Encarta.Running12==0 ||Encarta.Running13==0 || Encarta.Running14==0 ||Encarta.Running15==0 ||Encarta.Running16==0 ||Encarta.Running17==0 ||Encarta.Running18==0 ||Encarta.Running19==0 ||Encarta.Running20==0 )&&Encarta.flag==0)
        {
            call();
        }
    }
      
  }
     public void call()
     {
     try{
        	Thread.sleep(1000); }
        	catch(Exception e)
        	{
        		
        	}
        	Encarta.s++;
        
        	if(Encarta.s==60)
        	{
        		Encarta.m++;
        		if(Encarta.m==60)
        		{
        			Encarta.m=0;
        			Encarta.h++;
        		}
        		Encarta.s=0;
        	}
        	if((Encarta.m==20)&&Encarta.flag==0)
        	{       
                        //ResultWindow rw=new ResultWindow();
        		//rw.setVisible(true);
                       JOptionPane.showConfirmDialog(new JFrame(), "OOPS....TIME UP!!    Your Score is :  " + Encarta.marks + "       TIME  taken is :    " + Encarta.h+ ":"+ Encarta.m+ ":" + Encarta.s , "GAMEOVER ", JOptionPane.PLAIN_MESSAGE);
                      FileOutputStream fs;
                                try {
					fs = new FileOutputStream("karan1/participant.txt",true);
					String t="   :   MARKS :" + Encarta.marks +"   : MIN : "+Encarta.m +"   : SEC : "+Encarta.s;
					fs.write(t.getBytes());
                                        String s="\n";
					fs.write(s.getBytes());
					fs.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                                
                              
                       System.exit(0);
                    
                        Encarta.flag=1;
        
        	}
        	Encarta.hrs.setText(Integer.toString(Encarta.h)+" : ");
        	Encarta.min.setText(Integer.toString(Encarta.m)+" : ");
        	Encarta.sec.setText(Integer.toString(Encarta.s));
     }
    
}













