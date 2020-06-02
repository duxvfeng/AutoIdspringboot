package com.tmax.mapper;

import com.tmax.domain.ResOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResOrderMapper {

    @Insert("insert into  Res_Order (o_id, o_vid, o_addr, \n" +
            "      o_telno, o_detail, o_pid, o_vir_code,\n" +
            "      o_transform_company, o_transform_num, o_creatime, \n" +
            "      o_updatetime, status)\n" +
            "    values (#{oId,jdbcType=BIGINT}, #{oVid,jdbcType=VARCHAR}, #{oAddr,jdbcType=VARCHAR},\n" +
            "      #{oTelno,jdbcType=VARCHAR}, #{oDetail,jdbcType=VARCHAR}, #{oPid,jdbcType=INTEGER}, #{oVirCode,jdbcType=VARCHAR},\n" +
            "      #{oTransformCompany,jdbcType=VARCHAR}, #{oTransformNum,jdbcType=VARCHAR}, #{oCreatime,jdbcType=TIMESTAMP},\n" +
            "      #{oUpdatetime,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER})")
    void insert(ResOrder resOrder);
}
