package pe.gob.miraflores.mobile.dao.mapaincidencias;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pe.gob.miraflores.mobile.domain.mapaincidencias.MapaIncidenciasGeometria;
import pe.gob.miraflores.mobile.domain.mapaincidencias.MapaIncidenciasGeometriaCriteria;

public interface MapaIncidenciasGeometriaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int countByExample(MapaIncidenciasGeometriaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int deleteByExample(MapaIncidenciasGeometriaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int deleteByPrimaryKey(Integer idgeoreferencia);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int insert(MapaIncidenciasGeometria record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int insertSelective(MapaIncidenciasGeometria record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    List<MapaIncidenciasGeometria> selectByExample(MapaIncidenciasGeometriaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    MapaIncidenciasGeometria selectByPrimaryKey(Integer idgeoreferencia);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int updateByExampleSelective(@Param("record") MapaIncidenciasGeometria record, @Param("example") MapaIncidenciasGeometriaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int updateByExample(@Param("record") MapaIncidenciasGeometria record, @Param("example") MapaIncidenciasGeometriaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int updateByPrimaryKeySelective(MapaIncidenciasGeometria record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GEOMGEOMETRIA
     *
     * @mbggenerated Fri Oct 23 15:41:13 COT 2015
     */
    int updateByPrimaryKey(MapaIncidenciasGeometria record);
}