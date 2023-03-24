/*
 * Author Fisal Ikhmayes
 * Source code from: Southern New Hampshire University
 * class: CS 230
 * date: 03/24/23
 * 
 */

package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	 return user.getRoles() != null && user.getRoles().contains(role);
		
    	
    }
}