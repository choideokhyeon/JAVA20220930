package Team.Controller;

import Team.Domain.DTO;
import Team.Domain.MemDTO;
import Team.Service.MemService;

public class MemController implements SubController{

	MemService service = new MemService();
	
	@Override
	public Object execute(int SN, DTO dto) {
		Object obj = null;
		boolean flag = false;
		switch(SN)
		{
			case 1:
				MemDTO down = (MemDTO)dto;
				flag = service.RegisterMem(down);
				if(flag)
					obj = "[SYSTEM]회원 가입에 성공했습니다";
				else
					obj = "[SYSTEM]회원 가입에 실패했습니다";
		}
		
		
		return null;
	}

}
