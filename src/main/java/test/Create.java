package test;
import dao.SinhVien_DAO;
import entities.*;
public class Create {

	public static void main(String[] args) {
		SinhVien_DAO sinhVien_DAO=new SinhVien_DAO();
		// TODO Auto-generated method stub
		/*
		SinhVien sinhVien1=new SinhVien("sv1", "Nam", "Lê An", 10);
		SinhVien sinhVien2=new SinhVien("sv2", "Ban", "Lê An", 10);
		SinhVien sinhVien3=new SinhVien("sv3", "Minh", "Lê An", 10);
		SinhVien sinhVien4=new SinhVien("sv4", "Ngọc", "Lê An", 10);
		if(sinhVien_DAO.addSinhVien(sinhVien1)==0 || sinhVien_DAO.addSinhVien(sinhVien2)==0 || 
				sinhVien_DAO.addSinhVien(sinhVien3)==0 || sinhVien_DAO.addSinhVien(sinhVien4)==0)
		{
			System.out.println("Đã tồn tại Sinh Viên.");
		}
		if(sinhVien_DAO.addSinhVien(sinhVien1)==1)
		{
			System.out.println("Thêm thành công.");
		}
		if(sinhVien_DAO.addSinhVien(sinhVien2)==1)
		{
			System.out.println("Thêm thành công.");
		}
		if(sinhVien_DAO.addSinhVien(sinhVien3)==1)
		{
			System.out.println("Thêm thành công.");
		}
		if(sinhVien_DAO.addSinhVien(sinhVien4)==1)
		{
			System.out.println("Thêm thành công.");
		}*/
			
		System.out.println("Danh sách sinh viên.");
		System.out.println(sinhVien_DAO.getListSinhVien_ToString());
		
		SinhVien sinhVienUpdate=new SinhVien("sv5", "Khang", "Lê Văn Đạt", 10);
		/*
		if(sinhVien_DAO.addSinhVien(sinhVien5)==1)
		{
			System.out.println("Thêm thành công.");
		}
		System.out.println("Danh sách sinh viên.");
		System.out.println(sinhVien_DAO.getListSinhVien_ToString());*/
		sinhVien_DAO.updateSinhVien(sinhVienUpdate);
		System.out.println("Danh sách sinh viên sau khi cập nhật.");
		System.out.println(sinhVien_DAO.getListSinhVien_ToString());
	}

}
