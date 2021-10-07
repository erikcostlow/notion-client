/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.costlowcorp.notion;

import org.testng.annotations.Test;

/**
 *
 * @author Erik
 */
public class NotionClientTest {
    
    @Test
    public void testNotion(){
        var nc = new NotionClient("secret_VmjMMI4ZwCLr1JdXn3Z0YVgqJH5foPvo6a0amv0gtKL");
        nc.listDatabases();
        
        System.out.println("Running");
    }
}
