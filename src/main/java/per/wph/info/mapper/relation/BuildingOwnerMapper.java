package per.wph.info.mapper.relation;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import per.wph.info.model.relation.BuildingOwner;

@Repository
@Mapper
public interface BuildingOwnerMapper {
    int deleteByPrimaryKey(@Param("bid") Long bid, @Param("oid") Long oid);

    int insert(BuildingOwner record);

    List<BuildingOwner> selectAll();

    List<BuildingOwner> selectByOid(Long oid);

    List<BuildingOwner> selectByBid(Long bid);
}