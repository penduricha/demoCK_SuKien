package test;

import dao.SinhVien_DAO;

public class Delete {
	public static void main(String[] args) {
		SinhVien_DAO sinhVien_DAO=new SinhVien_DAO();
		System.out.println("Danh sách sinh viên.");
		System.out.println(sinhVien_DAO.getListSinhVien_ToString());
		String maSV="sv4";
		System.out.println(sinhVien_DAO.getListSinhVienByMa_ToString(maSV));
		/*
		if(sinhVien_DAO.deleteSinhVien(maSV))
		{
			System.out.println("Xóa thành công.");
			System.out.println("Danh sách sinh viên sau khi xóa:");
			System.out.println(sinhVien_DAO.getListSinhVien_ToString());
		}*/
	}
}
