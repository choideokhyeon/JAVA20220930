package Team.Service;

import Team.Domain.MemDAO;
import Team.Domain.MemDTO;

public class MemService {

	private MemDAO dao = MemDAO.getInstance();
	
	private static MemService instance;
	public static MemService getInstance()
	{
		if(instance == null)
			instance = new MemService();
		return instance;
	}
	
	public MemService() {}
	
	public boolean RegisterMem(MemDTO dto)
	{
		int result = dao.Insert(dto);
		if(result > 0)
			return true;
		return false;
	}
}
