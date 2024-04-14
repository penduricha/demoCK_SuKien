package entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sinhvien")
public class SinhVien {
	@Id
	@Column(name = "maSV", length = 100, columnDefinition = "nvarchar(25)",nullable = false)
	private String maSV;
	@Column(name = "tenSV", length = 100, columnDefinition = "nvarchar(25)",nullable = false)
	private String tenSV;
	@Column(name = "diaChi", length = 100, columnDefinition = "nvarchar(25)",nullable = false)
	private String diaChi;
	@Column(name = "diem", length = 100,nullable = false)
	private double diem;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSV, String tenSV, String diaChi, double diem) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diaChi = diaChi;
		this.diem = diem;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSV, other.maSV);
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", diaChi=" + diaChi + ", diem=" + diem + "]";
	}
	
}
