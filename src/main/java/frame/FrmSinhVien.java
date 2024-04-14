package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


import dao.SinhVien_DAO;

import i_face.I_FrmSinhVien;
import entities.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class FrmSinhVien extends javax.swing.JFrame implements ActionListener, MouseListener, I_FrmSinhVien{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form FrmLopHoc
     */
    public FrmSinhVien() {
    	setTitle("Sinh viên");
        initComponents();
        addEvent();
        renderTable();
        //renderCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">        
    SinhVien_DAO sinhVien_DAO=new SinhVien_DAO();
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        lblMa = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        spnDiem = new javax.swing.JSpinner();
        lblDiaChi = new javax.swing.JLabel();
        lblDiemThi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        comboboxTim = new javax.swing.JComboBox<>();
        btnXoaTrang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        //scrollPane = new javax.swing.JScrollPane();
        //jTable1 = new javax.swing.JTable();
        //giới hạn JSpinner
        SpinnerNumberModel model = new SpinnerNumberModel(10, 0, 10, 1);
        spnDiem.setModel(model); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("THÔNG TIN SINH VIÊN");
        lblTitle.setPreferredSize(new java.awt.Dimension(139, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTen.setText("Tên:");

        lblMa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMa.setText("Mã:");

        txtMa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        

        txtTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnDiem)
                    .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiaChi.setText("Địa chỉ:");

        lblDiemThi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiemThi.setText("Điểm thi:");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm");

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        

        btnTimKiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        

        btnXoaTrang.setBackground(new java.awt.Color(204, 204, 204));
        btnXoaTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaTrang.setText("Xóa trắng");
        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxTim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(comboboxTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaTrang)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlButtonLayout.createSequentialGroup()
                        .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMa)
                            .addComponent(lblTen)
                            .addComponent(lblDiaChi)
                            .addComponent(lblDiemThi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButtonLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiemThi))
                    .addGroup(pnlButtonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        //jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        //jPanel3.setSize(300,300);
        //Thuật toán tạo bảng
        
		//panelInfo.add(jScrollPane);
		//jPanel3.add(scrollPane);
        
		
		
		jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		
		String[] headers = "STT;Mã;Tên;Địa chỉ;Điểm".split(";");
        //String[] colName = "STT;Mã;Tên;Địa chỉ;Điểm thi".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		scrollPane= new JScrollPane();
		scrollPane.setViewportView(table = new JTable(tableModel));
		table.setRowHeight(25);
		jPanel3.add(scrollPane);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        //tạo bảng
        

        pack();
        //Thêm sự kiện
        
    }// </editor-fold>                        

                                              

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
            //java.util.logging.Logger.getLogger(FrmLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(FrmLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(FrmLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(FrmLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> comboboxTim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    //private javax.swing.JScrollPane scrollPane;
    //private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiemThi;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JSpinner spnDiem;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private DefaultTableModel tableModel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration  
    //Xử lí
	@Override
	public void mouseClicked(MouseEvent e) throws NumberFormatException {
		// TODO Auto-generated method stub
		int row=table.getSelectedRow();
		txtMa.setText(table.getValueAt(row, 1).toString());
		txtTen.setText(table.getValueAt(row, 2).toString());
		txtDiaChi.setText(table.getValueAt(row, 3).toString());
		spnDiem.setValue((int) Double.parseDouble(table.getValueAt(row, 4).toString()));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o=e.getSource();
		if(o.equals(btnXoaTrang))
		{
			resetComponents();
		}
		if(o.equals(btnThem))
		{
			addSinhVien();
		}
		if(o.equals(btnXoa))
		{
			deleteSinhVien();
		}
		if(o.equals(btnSua))
		{
			updateSinhVien();
		}
		if(o.equals(btnTimKiem))
		{
			renderTableFind();
		}
	}
	/*
	 * tableModel.setRowCount(0);    
	    if(getListNhanVien_MoiNhat().size() == 0) {
	        JOptionPane.showMessageDialog(null, "Không có dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    } else {
	        System.out.println("Đã load danh sách nhân viên.");
	        int stt= 1;
	        for(NhanVien n: getListNhanVien_MoiNhat()) {
	            String row[]= {Integer.toString(stt++),n.getMaNV(), n.getHo(), n.getTen(), phaiString(n.isPhai()),
	                    Integer.toString(n.getTuoi()), Double.toString(n.getTienLuong())};        
	            tableModel.addRow(row);
	            System.out.println(n.toString());
	        }
	    }
	 */
	@Override
	public void renderTable() {
		
		// TODO Auto-generated method stub
		tableModel.setRowCount(0);
		comboboxTim.removeAllItems();
		//String arr[]= {"a","b","c","d","e"};
		//tableModel.addRow(arr);
		if(sinhVien_DAO.getListSinhVien().size()==0)
		{
			JOptionPane.showMessageDialog(null, "Không có dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			System.out.println("Đã render danh sách sinh viên.");
			int stt= 1;
			for(SinhVien s: sinhVien_DAO.getListSinhVien())
			{
				String row[]= {Integer.toString(stt++),s.getMaSV(),s.getTenSV(),s.getDiaChi(),Double.toString(s.getDiem())};
				System.out.println(s.toString());
				tableModel.addRow(row);
				comboboxTim.addItem(s.getMaSV());
			}
		}
	}

	@Override
	public void resetComponents() {
		// TODO Auto-generated method stub
		txtMa.setText("");
		txtTen.setText("");
		txtDiaChi.setText("");
		spnDiem.setValue(0);
		renderTable();
		comboboxTim.setSelectedIndex(0);
	}

	@Override
	public boolean validateField() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addSinhVien() {
		// TODO Auto-generated method stub
		String ma=txtMa.getText();
		String ten=txtTen.getText();
		String diaChi=txtDiaChi.getText();
		int diem=(int) spnDiem.getValue();
		SinhVien sinhVien=new SinhVien(ma, ten, diaChi,(double)diem );
		if(sinhVien_DAO.addSinhVien(sinhVien)==1)
		{
			resetComponents();
			JOptionPane.showMessageDialog(null, "Thêm thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}else
		{
			JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi thêm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}	
	}
	/*
	 * int row = table.getSelectedRow();
		if (row != -1) {
			String maNV = table.getModel().getValueAt(row, 1).toString();
			int kTra = JOptionPane.showConfirmDialog(this, "Chắc chắn xoá không", "Chú ý", JOptionPane.YES_NO_OPTION);
			if (kTra == JOptionPane.YES_OPTION) {
				NhanVien n=new NhanVien();
				n.setMaNV(maNV);
				a_Frm_NhanVien.xoaNhanVien(n);
			}
		}
		loadData();
	 */
	@Override
	public void deleteSinhVien() {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		if (row != -1) {
			String maSV = table.getModel().getValueAt(row, 1).toString();
			int kTra = JOptionPane.showConfirmDialog(this, "Chắc chắn xoá không", "Chú ý", JOptionPane.YES_NO_OPTION);
			if (kTra == JOptionPane.YES_OPTION) {
				if(sinhVien_DAO.deleteSinhVien(maSV))
				{
					renderTable();
					JOptionPane.showMessageDialog(null, "Xóa thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
	}
	/*
	 * String maNV=txtMaNV.getText();
		String ho=txtHo.getText();
		String ten=txtTen.getText();
		String tuoi=txtTuoi.getText();
		String tienLuong=txtTienLuong.getText();
		CheckText_FrmNhanVien checkText_FrmNhanVien=new CheckText_FrmNhanVien(maNV, ho, ten, tuoi, tienLuong, radNam.isSelected(), radNu.isSelected());
		if(!checkText_FrmNhanVien.check_Null()||!checkText_FrmNhanVien.check_Regrex()||!checkText_FrmNhanVien.check_Digit())
		{
			System.out.println("Có dữ liệu bị sai.");
			//return false;
		}
		else
		{
			NhanVien n=new NhanVien(maNV,ho,ten,getBoolean_Phai(),Integer.parseInt(tuoi),Double.parseDouble(tienLuong));
			a_Frm_NhanVien.suaNhanVien(n);
			xoaTrang();
		}
	 */
	@Override
	public void updateSinhVien() {
		// TODO Auto-generated method stub
		String ma=txtMa.getText();
		String ten=txtTen.getText();
		String diaChi=txtDiaChi.getText();
		int diem=(int) spnDiem.getValue();
		SinhVien sinhVien=new SinhVien(ma, ten, diaChi,(double)diem );
		if(sinhVien_DAO.updateSinhVien(sinhVien))
		{
			renderTable();
			JOptionPane.showMessageDialog(null, "Cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}else
		{
			JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi cập nhật.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void renderTableFind() {
		// TODO Auto-generated method stub
		tableModel.setRowCount(0);
		String maSV=(String) comboboxTim.getSelectedItem();
		if(sinhVien_DAO.getListSinhVien().size()==0)
		{
			JOptionPane.showMessageDialog(null, "Không tìm thấy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			System.out.println("Đã render danh sách sinh viên.");
			int stt= 1;
			for(SinhVien s: sinhVien_DAO.getListSinhVienByMaSV(maSV))
			{
				String row[]= {Integer.toString(stt++),s.getMaSV(),s.getTenSV(),s.getDiaChi(),Double.toString(s.getDiem())};
				System.out.println(s.toString());
				tableModel.addRow(row);
				//comboboxTim.addItem(s.getMaSV());
			}
		}
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnTimKiem.addActionListener(this);
		comboboxTim.addActionListener(this);
		table.addMouseListener(this);
	}



	@Override
	public void renderCombobox() {
		// TODO Auto-generated method stub
		
	}
}

