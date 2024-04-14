package i_face;

import entities.SinhVien;
import java.util.*;
public interface I_SinhVien_DAO {
	public int addSinhVien(SinhVien s);
	public List<SinhVien> getListSinhVien();
	public String getListSinhVien_ToString();
	public boolean updateSinhVien(SinhVien s);
	public List<SinhVien> getListSinhVienByMaSV(String maSV);
	public String getListSinhVienByMa_ToString(String maSV);
	public boolean deleteSinhVien(String maSV);
	public SinhVien findSinhVien(String maSV);
	
}
