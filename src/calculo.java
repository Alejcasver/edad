
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class calculo extends javax.swing.JFrame {

  
    public calculo() {
        initComponents();
        this.setTitle("Calculo de tu edad");
        this.setLocation(480,200);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_anio = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        txt_dia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_edadAnios = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_actual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_edadMeses = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_edadDias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Año:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dia:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txt_anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anioActionPerformed(evt);
            }
        });
        txt_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 30));

        txt_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mesActionPerformed(evt);
            }
        });
        txt_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mesKeyTyped(evt);
            }
        });
        getContentPane().add(txt_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, 30));

        txt_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tu Edad es:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 30));

        txt_edadAnios.setEditable(false);
        getContentPane().add(txt_edadAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, 30));

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Siendo hoy:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txt_actual.setEditable(false);
        getContentPane().add(txt_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("años");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        txt_edadMeses.setEditable(false);
        getContentPane().add(txt_edadMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("meses");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        txt_edadDias.setEditable(false);
        getContentPane().add(txt_edadDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("días");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        bl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camino2.png"))); // NOI18N
        getContentPane().add(bl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 410, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
static public int cuentaDia = 0;
    private void txt_anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anioActionPerformed

    private void txt_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mesActionPerformed
 public static String fechaActual(){
       Date fecha = new Date();
       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
       return formatoFecha.format(fecha);
       }
 public static int cuentaAnios (int anio, int a_anio){
     int a = a_anio-anio;
 return (a);
 }
  public static int cuentaDia (int anio, int mes, int dia, int a_anio, int a_mes, int a_dia){
    
//cuenta dias de anos intermedios
      
    for (int i=(anio + 1);i<(a_anio);i++){
        if (i%4==0){
          if ((i%100==0)&&(i%400!=0)){
          calculo.cuentaDia=calculo.cuentaDia+365;
          }
          else{calculo.cuentaDia=calculo.cuentaDia+366;}
        }
        else {calculo.cuentaDia=calculo.cuentaDia+365;}
    }
//cuenta dias por meses en primer ano a partir del segundo mes
    
    int valor = 0; int meses1=0;
    for (int x = (mes+1);x<=12;x++){
        switch (x){
            case 2:{if (anio%4==0){
                        if ((anio%100==0)&&(anio%400!=0)){
                        valor= 28;
                        }
                        else{valor = 29;}
                        }
                    else {valor = 28;}
                    }
                break;
            case 3:valor = 31;
                break;
            case 4:valor = 30;
                break;
            case 5:valor = 31;
                break;
            case 6:valor = 30;
                break;
            case 7:valor = 31;
                break;
            case 8:valor = 31;
                break;
            case 9:valor = 30;
                break;
            case 10:valor = 31;
                break;
            case 11:valor = 30;
                break;
            case 12:valor = 31;
                break;
        }
        meses1 = meses1 + valor;
    }
// cuenta dias del mes en que nacio
    
    int valor2 = 0; int dias1=0;
    
        switch (mes){
            case 1: valor2 = 31;
                break;
            case 2:{if (anio%4==0){
                        if ((anio%100==0)&&(anio%400!=0)){
                        valor2= 28;
                        }
                        else{valor2 = 29;}
                        }
                    else {valor2 = 28;}
                    }
                break;
            case 3:valor2 = 31;
                break;
            case 4:valor2 = 30;
                break;
            case 5:valor2 = 31;
                break;
            case 6:valor2 = 30;
                break;
            case 7:valor2 = 31;
                break;
            case 8:valor2 = 31;
                break;
            case 9:valor2 = 30;
                break;
            case 10:valor2 = 31;
                break;
            case 11:valor2 = 30;
                break;
            case 12:valor2 = 31;
                break;
        }
        dias1 = valor2-dia;
        
        // cuenta dias ano presente
        
        int Bvalor = 0;  
        int P_mes = 0;
        for (int y = 1; y<a_mes;y++){ 
            switch (y){
                case 1:Bvalor = 31;
                 break;
                case 2:{if (anio%4==0){
                        if ((anio%100==0)&&(anio%400!=0)){
                        Bvalor= 28;
                        }
                        else{Bvalor = 29;}
                        }
                    else {Bvalor = 28;}
                    }
                 break;
                case 3:Bvalor = 31;
                 break;
                case 4:Bvalor = 30;
                 break;
                case 5:Bvalor = 31;
                 break;
                case 6:Bvalor = 30;
                 break;
                case 7:Bvalor = 31;
                 break;
                case 8:Bvalor = 31;
                 break;
                case 9:Bvalor = 30;
                 break;
                case 10:Bvalor = 31;
                 break;
                case 11:Bvalor = 30;
                 break;
                case 12:Bvalor = 31;
                 break;
        }
            P_mes = P_mes + Bvalor;
    }
        calculo.cuentaDia= calculo.cuentaDia + meses1 + dias1 +P_mes + (a_dia);//calculo.cuentaDia + meses1 + dias1 +P_mes + (a_dia-1);
                
  
 return (calculo.cuentaDia);
}
  
 
   public static int cuentaMes (int anio, int mes, int dia, int a_anio, int a_mes, int a_dia){
     int born = 12-mes;
     int present  = 0;
     if (dia >a_dia){
         present = a_mes-1;
     }
     else present = a_mes;
     int a = ((((a_anio - anio)-1)*12)+ born + present);
 return (a);
 }
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        calculo.cuentaDia =0;
        String Anio,Mes,Dia;
        int anio,mes,dia,minuto;
        Anio = txt_anio.getText();
        Mes = txt_mes.getText();
        Dia = txt_dia.getText();
 
        if ( (txt_anio.getText().equals(""))||(txt_mes.getText().equals(""))||(txt_dia.getText().equals("")) ){
              javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
       anio = Integer.parseInt(Anio);
       mes = Integer.parseInt(Mes);
       dia = Integer.parseInt(Dia);
       
       if ( anio < 1  ){
              javax.swing.JOptionPane.showMessageDialog(this,"El año no es valido \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
       if ( mes < 1 || mes >12 ){
              javax.swing.JOptionPane.showMessageDialog(this,"El mes no es valido \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
       if ( dia < 1 || dia >31 ){
              javax.swing.JOptionPane.showMessageDialog(this,"El día no es valido \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
      txt_actual.setText(fechaActual());
      Calendar fecha = Calendar.getInstance();
      int a_dia = fecha.get(Calendar.DAY_OF_MONTH);
      int a_mes = 1 + fecha.get(Calendar.MONTH);
      int a_anio = fecha.get(Calendar.YEAR);
      
      
   
      
      if ( (anio > a_anio)||((anio == a_anio) && (mes>a_mes))||((anio == a_anio) && (mes==a_mes)&&(dia>a_dia))){
              javax.swing.JOptionPane.showMessageDialog(this,"Dejame informarte que aun no has nacido \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
      else{
          if (mes>=a_mes){
              if (mes == a_mes){
                  if (dia <= a_dia){txt_edadAnios.setText (Integer.toString(cuentaAnios(anio,a_anio)));}
                  else {txt_edadAnios.setText (Integer.toString(cuentaAnios(anio,(a_anio)-1)));}
              }
              else {txt_edadAnios.setText (Integer.toString(cuentaAnios(anio,(a_anio)-1)));}
          }
          else{
          txt_edadAnios.setText (Integer.toString(cuentaAnios(anio,a_anio)));
          }
          
          txt_edadMeses.setText (Integer.toString(cuentaMes(anio,mes,dia,a_anio,a_mes,a_dia)));
          txt_edadDias.setText (Integer.toString(cuentaDia(anio,mes,dia,a_anio,a_mes,a_dia)));
      }
      
    }//GEN-LAST:event_calcularActionPerformed

    private void txt_anioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anioKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txt_anioKeyTyped

    private void txt_mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txt_mesKeyTyped

    private void txt_diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txt_diaKeyTyped

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
            java.util.logging.Logger.getLogger(calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bl_fondo;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_actual;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_edadAnios;
    private javax.swing.JTextField txt_edadDias;
    private javax.swing.JTextField txt_edadMeses;
    private javax.swing.JTextField txt_mes;
    // End of variables declaration//GEN-END:variables
}
