package com.example.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.example.TestesPageObj.*;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TesteLogin.class,TesteInsercao.class,
})
public class TestSuiteSCRM {
}
