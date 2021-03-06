package pe.gob.miraflores.mobile.domain.catastro;

import java.util.ArrayList;
import java.util.List;

public class DistritoCriteria {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public DistritoCriteria() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andDistritoIdIsNull() {
			addCriterion("distrito_id is null");
			return (Criteria) this;
		}

		public Criteria andDistritoIdIsNotNull() {
			addCriterion("distrito_id is not null");
			return (Criteria) this;
		}

		public Criteria andDistritoIdEqualTo(Integer value) {
			addCriterion("distrito_id =", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdNotEqualTo(Integer value) {
			addCriterion("distrito_id <>", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdGreaterThan(Integer value) {
			addCriterion("distrito_id >", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("distrito_id >=", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdLessThan(Integer value) {
			addCriterion("distrito_id <", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdLessThanOrEqualTo(Integer value) {
			addCriterion("distrito_id <=", value, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdIn(List<Integer> values) {
			addCriterion("distrito_id in", values, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdNotIn(List<Integer> values) {
			addCriterion("distrito_id not in", values, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdBetween(Integer value1, Integer value2) {
			addCriterion("distrito_id between", value1, value2, "distritoId");
			return (Criteria) this;
		}

		public Criteria andDistritoIdNotBetween(Integer value1, Integer value2) {
			addCriterion("distrito_id not between", value1, value2, "distritoId");
			return (Criteria) this;
		}

		public Criteria andNombreNombreIsNull() {
			addCriterion("nombre_nombre is null");
			return (Criteria) this;
		}

		public Criteria andNombreNombreIsNotNull() {
			addCriterion("nombre_nombre is not null");
			return (Criteria) this;
		}

		public Criteria andNombreNombreEqualTo(String value) {
			addCriterion("nombre_nombre =", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreNotEqualTo(String value) {
			addCriterion("nombre_nombre <>", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreGreaterThan(String value) {
			addCriterion("nombre_nombre >", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreGreaterThanOrEqualTo(String value) {
			addCriterion("nombre_nombre >=", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreLessThan(String value) {
			addCriterion("nombre_nombre <", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreLessThanOrEqualTo(String value) {
			addCriterion("nombre_nombre <=", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreLike(String value) {
			addCriterion("nombre_nombre like", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreNotLike(String value) {
			addCriterion("nombre_nombre not like", value, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreIn(List<String> values) {
			addCriterion("nombre_nombre in", values, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreNotIn(List<String> values) {
			addCriterion("nombre_nombre not in", values, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreBetween(String value1, String value2) {
			addCriterion("nombre_nombre between", value1, value2, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andNombreNombreNotBetween(String value1, String value2) {
			addCriterion("nombre_nombre not between", value1, value2, "nombreNombre");
			return (Criteria) this;
		}

		public Criteria andGeometriaIsNull() {
			addCriterion("geometria is null");
			return (Criteria) this;
		}

		public Criteria andGeometriaIsNotNull() {
			addCriterion("geometria is not null");
			return (Criteria) this;
		}

		public Criteria andGeometriaEqualTo(Object value) {
			addCriterion("geometria =", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaNotEqualTo(Object value) {
			addCriterion("geometria <>", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaGreaterThan(Object value) {
			addCriterion("geometria >", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaGreaterThanOrEqualTo(Object value) {
			addCriterion("geometria >=", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaLessThan(Object value) {
			addCriterion("geometria <", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaLessThanOrEqualTo(Object value) {
			addCriterion("geometria <=", value, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaIn(List<Object> values) {
			addCriterion("geometria in", values, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaNotIn(List<Object> values) {
			addCriterion("geometria not in", values, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaBetween(Object value1, Object value2) {
			addCriterion("geometria between", value1, value2, "geometria");
			return (Criteria) this;
		}

		public Criteria andGeometriaNotBetween(Object value1, Object value2) {
			addCriterion("geometria not between", value1, value2, "geometria");
			return (Criteria) this;
		}

		public Criteria andNombreNombreLikeInsensitive(String value) {
			addCriterion("upper(nombre_nombre) like", value.toUpperCase(), "nombreNombre");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table test.distritos
	 * @mbggenerated  Wed Dec 23 16:09:20 COT 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test.distritos
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 23 14:35:28 COT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}