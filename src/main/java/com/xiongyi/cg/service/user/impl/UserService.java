package com.xiongyi.cg.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiongyi.cg.dao.DaoSupport;
import com.xiongyi.cg.entity.Page;
import com.xiongyi.cg.entity.User;
import com.xiongyi.cg.service.user.UserManager;
import com.xiongyi.cg.util.PageData;



/**
 * @author GUXIONG
 * @description ϵͳ�û�
 */
@Service("userService")
public class UserService implements UserManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**��¼�ж�
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData getUserByNameAndPwd(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserMapper.getUserInfo", pd);
	}
	
	/**���µ�¼ʱ��
	 * @param pd
	 * @throws Exception
	 */
	public void updateLastLogin(PageData pd)throws Exception{
		dao.update("UserMapper.updateLastLogin", pd);
	}
	
	/**ͨ���û�ID��ȡ�û���Ϣ�ͽ�ɫ��Ϣ
	 * @param USER_ID
	 * @return
	 * @throws Exception
	 */
	public User getUserAndRoleById(String USER_ID) throws Exception {
		return (User) dao.findForObject("UserMapper.getUserAndRoleById", USER_ID);
	}
	
	/**ͨ��USERNAEME��ȡ����
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserMapper.findByUsername", pd);
	}
	
	/**�г�ĳ��ɫ�µ������û�
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserByRoldId(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserMapper.listAllUserByRoldId", pd);
		
	}
	
	/**�����û�IP
	 * @param pd
	 * @throws Exception
	 */
	public void saveIP(PageData pd)throws Exception{
		dao.update("UserMapper.saveIP", pd);
	}
	
	/**�û��б�
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listUsers(Page page)throws Exception{
		return (List<PageData>) dao.findForList("UserMapper.userlistPage", page);
	}
	
	/**ͨ�������ȡ����
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUE(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserMapper.findByUE", pd);
	}
	
	/**ͨ����Ż�ȡ����
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUN(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserMapper.findByUN", pd);
	}
	
	/**ͨ��id��ȡ����
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserMapper.findById", pd);
	}
	
	/**�����û�
	 * @param pd
	 * @throws Exception
	 */
	public void saveU(PageData pd)throws Exception{
		dao.save("UserMapper.saveU", pd);
	}
	 
	/**�޸��û�
	 * @param pd
	 * @throws Exception
	 */
	public void editU(PageData pd)throws Exception{
		dao.update("UserMapper.editU", pd);
	}
	
	/**ɾ���û�
	 * @param pd
	 * @throws Exception
	 */
	public void deleteU(PageData pd)throws Exception{
		dao.delete("UserMapper.deleteU", pd);
	}
	
	/**����ɾ���û�
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAllU(String[] USER_IDS)throws Exception{
		dao.delete("UserMapper.deleteAllU", USER_IDS);
	}
	
	/**�û��б�(ȫ��)
	 * @param USER_IDS
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUser(PageData pd)throws Exception{
		return (List<PageData>) dao.findForList("UserMapper.listAllUser", pd);
	}
	
	/**��ȡ����
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserCount(String value)throws Exception{
		return (PageData)dao.findForObject("UserMapper.getUserCount", value);
	}
	
}