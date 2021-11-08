package com.malcoedcp.persistence.base;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.malcoedcp.persistence.IntgTestConfig;
import com.malcoedcp.persistence.utils.YamlDataSetLoader;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@MybatisTest
@RunWith(SpringRunner.class)
@Import({IntgTestConfig.class})
@DbUnitConfiguration(databaseConnection = "dbUnitDatabaseConnection", dataSetLoader = YamlDataSetLoader.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@AutoConfigureTestDatabase(replace = NONE)
@ActiveProfiles("test")
public abstract class RepositoryTestBase {

}
