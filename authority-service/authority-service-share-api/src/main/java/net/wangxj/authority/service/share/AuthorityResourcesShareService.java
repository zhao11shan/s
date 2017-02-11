
package net.wangxj.authority.service.share;

import net.wangxj.authority.Response;
import java.util.List;
import net.wangxj.authority.dto.AuthorityResourcesDTO;

/**
 * created by	: wangxj
 * created time	: 2016-12-26 18:06:38
 */

public interface AuthorityResourcesShareService{

	/**
	 * 添加AuthorityResourcesDTO
	 * @return	新增主键
	 */
	public Response<Integer> add(AuthorityResourcesDTO authorityResourcesDto);
	
	/**
	 * 批量添加
	 * @return 成功添加的条数
	 */
	public Response<Integer> addBatch(List<AuthorityResourcesDTO> listDto);
	
	/**
	 * 根据主键ID修改
	 * @return 新增条数: 默认1
	 */
	public Response<Integer> modifyByUuid(AuthorityResourcesDTO authorityResourcesDto);
	
	/**
	 * 条件查询
	 */
	public Response<AuthorityResourcesDTO> queryListByCondition(AuthorityResourcesDTO authorityResourcesDto);
	
	/**
	 * 条件分页查询
	 * @param pageNum: 页码
	 * @param limit:   每页条数
	 */
	public Response<AuthorityResourcesDTO> queryPageListByCondition(AuthorityResourcesDTO authorityResourcesDto, int pageNum, int limit, String order, String sort);
	
	/**
	 * 条件数量查询
	 * @return
	 */
	public Response<Integer> getCountByCondition(AuthorityResourcesDTO authorityResourcesDto, boolean noDelete);
	/**
	 * 根据uuid删除
	 * @param resourceDto
	 * @return
	 */
	Response<Integer> deleteByUuid(AuthorityResourcesDTO resourceDto);
	/**
	 * 批量删除
	 * @param listResource
	 * @return
	 */
	Response<Integer> deleteByBatch(List<AuthorityResourcesDTO> listResource);
	

}