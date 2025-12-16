package edu.ucam.calidad.integracion_continua.biz.api.impl;


import cn.org.thinkcloud.commons.business.api.impl.BaseServiceImpl;
import edu.ucam.calidad.integracion_continua.biz.api.UmsUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import edu.ucam.calidad.integracion_continua.domain.UmsUser;
import edu.ucam.calidad.integracion_continua.repo.api.UmsUserRepository;

/**
 * <p>
 * 服务实现类
 * </p>
 *@author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserServiceImpl extends BaseServiceImpl<UmsUserRepository, UmsUser> implements UmsUserService {

    @DubboReference(version = "1.0.0")
    private UmsUserRepository umsUserRepository;

}
