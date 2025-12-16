package edu.ucam.calidad.integracion_continua.repo.api.impl;


import edu.ucam.calidad.integracion_continua.repo.api.UmsUserRepository;
import cn.org.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;
import edu.ucam.calidad.integracion_continua.domain.UmsUser;
import edu.ucam.calidad.integracion_continua.repo.mapper.UmsUserMapper;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {

}
