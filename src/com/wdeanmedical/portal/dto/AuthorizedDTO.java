/*
 * WDean Medical is distributed under the
 * GNU Lesser General Public License (GNU LGPL).
 * For details see: http://www.wdeanmedical.com
 * copyright 2013-2014 WDean Medical
 */
 
package com.wdeanmedical.portal.dto;

public class AuthorizedDTO extends BooleanResultDTO {

    private String sessionId;
    private String activationCode;
    private boolean authenticated = true;


    public AuthorizedDTO() {
    }
    
    public String getActivationCode() { return activationCode; }
	public void setActivationCode(String activationCode) { this.activationCode = activationCode; }

	public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public boolean getAuthenticated() { return authenticated; }
    public void setAuthenticated(boolean authenticated) { this.authenticated = authenticated; }

}
