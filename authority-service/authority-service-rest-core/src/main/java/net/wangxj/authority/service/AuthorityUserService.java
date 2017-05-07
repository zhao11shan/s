

package net.wangxj.authority.service;

import java.util.List;
import net.wangxj.authority.po.AuthorityUserPO;

/**
 * created by	: wangxj
 * created time	: 2016-12-26 18:06:42
 */

public interface AuthorityUserService{
	/**
	 * 新增
	 * @return
	 * @throws Exception 
	 */
	public Integer add(AuthorityUserPO authorityUserPo) throws Exception;
	
	/**
	 * 批量添加
	 * @return
	 */
	public Integer addBatch(List<AuthorityUserPO> listPo);
	
	/**
	 * 根据主键ID修改
	 * @return
	 */
	public Integer modifyByUuid(AuthorityUserPO authorityUserPo);
	
	/**
	 * 条件查询
	 */
	public List<AuthorityUserPO> queryListByCondition(AuthorityUserPO authorityUserPo);
	
	/**
	 * 条件分页查询
	 */
	public List<AuthorityUserPO> queryPageListByCondition(AuthorityUserPO authorityUserPo, int pageNum, int limit,String order,String sort);
	
	/**
	 * 条件数量查询
	 * @return
	 */
	public Integer getCountByCondition(AuthorityUserPO authorityUserPo);

	/**
	 * 批量更新
	 * @param userList
	 * @return
	 */
	Integer modifyByBatch(List<AuthorityUserPO> userList);
}