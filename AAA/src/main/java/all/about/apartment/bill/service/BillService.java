package all.about.apartment.bill.service;

import java.util.List;

import all.about.apartment.bill.domain.EnergyVO;
import all.about.apartment.bill.domain.Personal_mgmt_exVO;
import all.about.apartment.bill.domain.SaleBillVO;

public interface BillService {
	
	public List<Personal_mgmt_exVO> getPersonal_mgmt_exList() throws Exception;
	public Personal_mgmt_exVO getMonthBill(String u_id , String p_month) throws Exception;
	public List<SaleBillVO> getSaleBill(Integer input_num) throws Exception;
	public List<EnergyVO> getEnergyList(String u_id, String p_month) throws Exception;
	public List<Personal_mgmt_exVO> getSelectDetail(String u_id, String p_month) throws Exception;
	public List<EnergyVO> getYearEnergy(String u_id, String p_month) throws Exception;
	public int getElecAVG(String energyName,String p_month, int width) throws Exception;
}