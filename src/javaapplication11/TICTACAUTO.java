
package javaapplication11;
import java.util.Random;
import javax.swing.JOptionPane;

public class TICTACAUTO extends javax.swing.JFrame {
    
    int user=1,comp=0,tie=1,count=0;
    Random rand = new Random();
    
    void comp()
    {
        int turn = rand.nextInt(2);
        System.out.println(turn);
        if(turn==0)
        {
            if(b5.getText().equalsIgnoreCase(""))
            {
                b5.setText("0");
            }
    
            else if(b8.getText().equalsIgnoreCase(""))
            {
                b8.setText("0");
            }
        
            else if(b4.getText().equalsIgnoreCase(""))
            {
                b4.setText("0");
            }
            
            else if(b3.getText().equalsIgnoreCase(""))
            {
                b3.setText("0");
            }
    
            else if(b2.getText().equalsIgnoreCase(""))
            {
                b2.setText("0");
            }
        
            else if(b7.getText().equalsIgnoreCase(""))
            {
                b7.setText("0");
            }
            
            else if(b1.getText().equalsIgnoreCase(""))
            {
                b1.setText("0");
            }
    
            else if(b9.getText().equalsIgnoreCase(""))
            {
                b9.setText("0");
            }
        
            else if(b6.getText().equalsIgnoreCase(""))
            {
                b6.setText("0");
            }
        }
        
        else if(turn==1)
        {
            if(b8.getText().equalsIgnoreCase(""))
            {
                b8.setText("0");
            }
    
            else if(b4.getText().equalsIgnoreCase(""))
            {
                b4.setText("0");
            }
        
            else if(b3.getText().equalsIgnoreCase(""))
            {
                b3.setText("0");
            }
            
            else if(b2.getText().equalsIgnoreCase(""))
            {
                b2.setText("0");
            }
    
            else if(b7.getText().equalsIgnoreCase(""))
            {
                b7.setText("0");
            }
        
            else if(b1.getText().equalsIgnoreCase(""))
            {
                b1.setText("0");
            }
            
            else if(b9.getText().equalsIgnoreCase(""))
            {
                b9.setText("0");
            }
    
            else if(b6.getText().equalsIgnoreCase(""))
            {
                b6.setText("0");
            }
        
            else if(b5.getText().equalsIgnoreCase(""))
            {
                b5.setText("0");
            }
        }    
        
    }
    
    int checkuser()
    {
        tie = 1;
        count++;
        if(b1.getText().equalsIgnoreCase("x") && b2.getText().equalsIgnoreCase("x") && b3.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
            
        }
        
       else if(b4.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b6.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
       else if(b7.getText().equalsIgnoreCase("x") && b8.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
       else if(b1.getText().equalsIgnoreCase("x") && b4.getText().equalsIgnoreCase("x") && b7.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
       else if(b2.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b8.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
       else if(b3.getText().equalsIgnoreCase("x") && b6.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
       else if(b1.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0; 
        }
        
       else if(b3.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b7.getText().equalsIgnoreCase("x"))
        {
            JOptionPane.showMessageDialog(this, "USER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        return count;
    }
    
    int checkcomp()
    {
        tie=1;
        count++;
        if(b1.getText().equalsIgnoreCase("0") && b2.getText().equalsIgnoreCase("0") && b3.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b4.getText().equalsIgnoreCase("0") && b5.getText().equalsIgnoreCase("0") && b6.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b7.getText().equalsIgnoreCase("0") && b8.getText().equalsIgnoreCase("0") && b9.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b1.getText().equalsIgnoreCase("0") && b4.getText().equalsIgnoreCase("0") && b7.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b2.getText().equalsIgnoreCase("0") && b5.getText().equalsIgnoreCase("0") && b8.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b3.getText().equalsIgnoreCase("0") && b6.getText().equalsIgnoreCase("0") && b9.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b1.getText().equalsIgnoreCase("0") && b5.getText().equalsIgnoreCase("0") && b9.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        if(b3.getText().equalsIgnoreCase("0") && b5.getText().equalsIgnoreCase("0") && b7.getText().equalsIgnoreCase("0"))
        {
            JOptionPane.showMessageDialog(this, "COMPUTER WINS !!!!");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            user=1;
            comp=0;
            count=0;
        }
        
        return count;
    }
    public TICTACAUTO() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(user==1)
        {
            if(b3.getText().equalsIgnoreCase(""))
            {
                b3.setText("X"); 
                user=0;
                comp=1;
                int i = checkuser();
                if(i==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp(); 
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }                 
            }           
        }                                                 
    }
 }       

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if(user==1)
        {
            if(b1.getText().equalsIgnoreCase(""))
            {
                b1.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
                
            }
        }        
    }
}        

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
         if(user==1)
        {
            if(b2.getText().equalsIgnoreCase(""))
            {
                b2.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }       
    }
}

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(user==1)
        {
            if(b4.getText().equalsIgnoreCase(""))
            {
                b4.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }        
    } 
}    

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
         if(user==1)
        {
            if(b5.getText().equalsIgnoreCase(""))
            {
                b5.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }        
    }
}

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        if(user==1)
        {
            if(b6.getText().equalsIgnoreCase(""))
            {
                b6.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }        
    } 
}

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
         if(user==1)
        {
            if(b7.getText().equalsIgnoreCase(""))
            {
                b7.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }        
    }
}

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
         if(user==1)
        {
            if(b8.getText().equalsIgnoreCase(""))
            {
                b8.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }        
    }
}

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
         if(user==1)
        {
            if(b9.getText().equalsIgnoreCase(""))
            {
                b9.setText("X");
                user=0;
                comp=1;
                int i = checkuser();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                    user=1;
                    comp=0;
                }
                if(comp==1)
                {
                comp();            
                user=1;
                comp=0;
                int j = checkcomp();
                if(count==9)
                {
                    JOptionPane.showMessageDialog(this, "TIE GAME");
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");
                }
            }
        }                    
    } 
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TICTACAUTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACAUTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACAUTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACAUTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACAUTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
