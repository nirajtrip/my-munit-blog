package com.mycompany.it.eai.munit;

import org.mule.munit.runner.java.AbstractMuleSuite;

public class MunitInStudio extends AbstractMuleSuite{

    @Override
    public String getConfigResources() {
        
             return "test-my-sample-projct.xml";
     }
}
