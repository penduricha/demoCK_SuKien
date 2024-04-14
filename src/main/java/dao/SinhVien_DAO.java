package dao;
import java.util.*;



import database.*;
import entities.*;
import i_face.I_SinhVien_DAO;
import jakarta.persistence.TypedQuery;
public class SinhVien_DAO implements I_SinhVien_DAO {
	List<SinhVien> listSinhVien=new ArrayList<>();
	Connect con=new Connect();
	Hibernate hibernate=new Hibernate("qlsv");
	public SinhVien_DAO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int addSinhVien(SinhVien s) {
		// TODO Auto-generated method stub
		try {
			hibernate.getTransaction().begin();
			// Kiểm tra xem khóa chính đã tồn tại hay chưa
			if (findSinhVien(s.getMaSV()) != null) {
				// Nếu ID đã tồn tại, không thêm vào cơ sở dữ liệu
				System.out.println("Mã sinh viên đã tồn tại trong cơ sở dữ liệu.");
				// return false;
				return 0;
			}
			// Nếu khóa chính chưa tồn tại, thực hiện thêm vào cơ sở dữ liệu
			hibernate.getEntityManager().persist(s);
			hibernate.getTransaction().commit();
			System.out.println("Thêm dữ liệu Sinh Viên thành công!");
			return 1;
		} catch (Exception e) {
			if (hibernate.getEntityManager() != null && hibernate.getTransaction().isActive()) {
				hibernate.getTransaction().rollback();
				// return false;
			}
			e.printStackTrace();
			System.out.println(e);
			//hibernate.closeTransaction();
			return -1;
		}
	}
	@Override
	public List<SinhVien> getListSinhVien() {
		// TODO Auto-generated method stub
		try {
			TypedQuery<SinhVien> query = hibernate.getEntityManager().createQuery("SELECT s FROM SinhVien s", SinhVien.class);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			//herbinate.closeTransaction();
			return null;
		}
	}
	@Override
	public String getListSinhVien_ToString() {
		// TODO Auto-generated method stub
		String str="";
		for(SinhVien s: getListSinhVien())
		{
			str+=s.toString()+"\n";
		}
		return str;
	}
	/*
	 * public boolean updateStorage(Storage s) {
		try {
			hibernate.getTransaction().begin();
			// Lấy đối tượng từ cơ sở dữ liệu
			Storage storageFind = hibernate.getEntityManager().find(Storage.class, s.getStorageId());
			// Thực hiện các thay đổi trên đối tượng
			if (storageFind != null) {
				//public Storage(String name, Date foundDate, double incomeBudget, String address) 
				storageFind.setName(s.getName());
				storageFind.setFoundDate(s.getFoundDate());
				storageFind.setIncomeBudget(s.getIncomeBudget());
				storageFind.setAddress(s.getAddress());
				
				hibernate.getEntityManager().merge(storageFind);
				hibernate.getTransaction().commit();
				System.out.println("Cập nhật Storage thành công với id là: "+s.getStorageId());
				return true;
			} else {
				System.out.println("Không tìm thấy.");
				return false;
			}

		} catch (Exception e) {
			if (hibernate.getTransaction().isActive()) {
				hibernate.getTransaction().rollback();
			}
			e.printStackTrace();
			System.out.println(e);
		} finally {
			//entityManager.close();
		}
		return false;
	}
	 */
	@Override
	public boolean updateSinhVien(SinhVien s)
	{
		try {
			hibernate.getTransaction().begin();		
			// Thực hiện các thay đổi trên đối tượng
			SinhVien sinhVienFind=findSinhVien(s.getMaSV());
			if (sinhVienFind!= null) {
				//public SinhVien(String maSV, String tenSV, String diaChi, double diem)
				sinhVienFind.setTenSV(s.getTenSV());				
				sinhVienFind.setDiaChi(s.getDiaChi());
				sinhVienFind.setDiem(s.getDiem());			
				hibernate.getEntityManager().merge(sinhVienFind);
				hibernate.getTransaction().commit();
				System.out.println("Cập nhật SinhVien thành công với maSV là: "+s.getMaSV());
				return true;
			} else {
				System.out.println("Không tìm thấy.");
				return false;
			}

		} catch (Exception e) {
			if (hibernate.getTransaction().isActive()) {
				hibernate.getTransaction().rollback();
			}
			e.printStackTrace();
			System.out.println(e);
		} finally {
			//entityManager.close();
		}
		return false;
	}
	@Override
	public List<SinhVien> getListSinhVienByMaSV(String maSV) {
		// TODO Auto-generated method stub
		try {
	        TypedQuery<SinhVien> query = hibernate.getEntityManager().createQuery("SELECT s FROM SinhVien s WHERE s.maSV = :maSV", SinhVien.class);
	        query.setParameter("maSV", maSV);
	        return query.getResultList();
	    } catch (Exception e) {
	    	e.printStackTrace();
			System.out.println(e);
	        //herbinate.closeTransaction();
	        return null;
	    }
	}
	@Override
	public String getListSinhVienByMa_ToString(String maSV) {
		// TODO Auto-generated method stub
		String str="";
		for(SinhVien s: getListSinhVienByMaSV(maSV))
		{
			str+=s.toString()+"\n";
		}
		return str;
	}
	/*
	 * try {
			hibernate.getTransaction().begin();
			// Kiểm tra xem khóa chính đã tồn tại hay chưa
			
			if (findById(milkId) != null) {
				// Nếu ID đã tồn tại, không thêm vào cơ sở dữ liệu
				System.out.println("Có khóa chính trong cơ sở dữ liệu.");
				// return false;
				// Xóa
				hibernate.getEntityManager().remove(findById(milkId));	
				//Cách khác
				//hibernate.getEntityManager().createQuery("delete from Milk m where m.milkId= :milkId").setParameter("milkId", m.getMilkId()).executeUpdate();
				hibernate.getTransaction().commit();
				System.out.println("Xóa dữ liệu thành công! với "+milkId);
				return true;
			}		

		} catch (Exception e) {
			if (hibernate.getTransaction() != null && hibernate.getTransaction().isActive()) {
				hibernate.getTransaction().rollback();
				return false;
			}
			e.printStackTrace();
			System.out.println(e);
			//herbinate.closeTransaction();
		}
		return false;
	 */
	@Override
	public boolean deleteSinhVien(String maSV) {
		// TODO Auto-generated method stub
		try {
			hibernate.getTransaction().begin();
			// Kiểm tra xem khóa chính đã tồn tại hay chưa		
			if (findSinhVien(maSV) != null) {
				// Nếu ID đã tồn tại, không thêm vào cơ sở dữ liệu
				// Xóa
				hibernate.getEntityManager().remove(findSinhVien(maSV));			
				hibernate.getTransaction().commit();
				System.out.println("Xóa dữ liệu thành công! với "+maSV);
				return true;
			}		
		} catch (Exception e) {
			if (hibernate.getTransaction() != null && hibernate.getTransaction().isActive()) {
				hibernate.getTransaction().rollback();
				return false;
			}
			e.printStackTrace();
			System.out.println(e);
			//herbinate.closeTransaction();
		}
		return false;
	}
	@Override
	public SinhVien findSinhVien(String maSV) {
		// TODO Auto-generated method stub
		return hibernate.getEntityManager().find(SinhVien.class, maSV);
	}
}
