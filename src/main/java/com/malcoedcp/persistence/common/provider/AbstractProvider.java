package com.malcoedcp.persistence.common.provider;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.apache.commons.lang.*;

@SuppressWarnings("unused")
public abstract class AbstractProvider<T> {
    public static final String ERROR_MESSAGE = "The input ids should not empty.";

    protected abstract String getTableName();

    protected abstract String getBaseColumn();

    protected String getId() {
        return null;
    }

    protected void buildSearchCondition(T t, SQL sql) {
    }

    protected void buildInsertSelective(T t, SQL sql) {

    }

    @SuppressWarnings("unused")
    public String listSelective(T t) {
        SQL selectSql = new SQL();
        selectSql.SELECT(getBaseColumn());
        selectSql.FROM(getTableName());
        buildSearchCondition(t, selectSql);
        return selectSql.toString();
    }

    @SuppressWarnings("unused")
    public String insertSelective(T t) {
        SQL insertSql = new SQL();
        insertSql.INSERT_INTO(getTableName());
        buildInsertSelective(t, insertSql);
        return insertSql.toString();
    }

    @SuppressWarnings("unused")
    public String deleteByIds(@Param("ids") List<Long> ids) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(ids), ERROR_MESSAGE);
        SQL sql = new SQL();

        sql.DELETE_FROM(getTableName());
        String template = "id in (%s)";
        String valueStatementPattern = "#{ids[:arrayIndex]}";
        String valueStatement = getValueStatement(valueStatementPattern, ids.size());
        sql.WHERE(String.format(template, valueStatement));

        return sql.toString();
    }

    public String deleteById(@Param("id") String id) {
        Preconditions.checkArgument(!Objects.isNull(id), ERROR_MESSAGE);
        SQL sql = new SQL();
        sql.DELETE_FROM(getTableName());
        String template = "%s = \"%s\"";
        sql.WHERE(String.format(template, getId(), id));
        return sql.toString();
    }

    public String markAsDeleteStatusByIds(@Param("ids") List<Long> ids) {
        Preconditions.checkArgument(CollectionUtils.isNotEmpty(ids), ERROR_MESSAGE);
        SQL sql = new SQL();

        sql.UPDATE(getTableName());
        sql.SET("is_delete = 1");
        String template = "id in (%s)";
        String valueStatementPattern = "#{ids[:arrayIndex]}";
        String valueStatement = getValueStatement(valueStatementPattern, ids.size());
        sql.WHERE(String.format(template, valueStatement));

        return sql.toString();
    }

    protected String getValueStatement(String valueStatementPattern, int batchSize) {
        Preconditions.checkArgument(StringUtils.isNotBlank(valueStatementPattern), "Value pattern should not blank.");

        final List<String> valueStatements = Lists.newArrayList();
        for (int i = 0; i < batchSize; i++) {
            valueStatements.add(valueStatementPattern.replaceAll(":arrayIndex", String.valueOf(i)));
        }
        return Joiner.on(",").join(valueStatements);
    }
}
