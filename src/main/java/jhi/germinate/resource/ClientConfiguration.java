package jhi.germinate.resource;

import java.util.List;

import jhi.germinate.server.auth.AuthenticationMode;

/**
 * @author Sebastian Raubach
 */
public class ClientConfiguration
{
	private List<String>       colorsTemplate;
	private List<String>       colorsCharts;
	private List<String>       hiddenPages;
	private List<String>       dashboardCategories;
	private String             googleAnalyticsKey;
	private AuthenticationMode authMode;
	private Boolean            registrationEnabled;
	private Boolean            showGdprNotification;
	private Boolean            commentsEnabled;

	public ClientConfiguration()
	{
	}

	public List<String> getColorsTemplate()
	{
		return colorsTemplate;
	}

	public ClientConfiguration setColorsTemplate(List<String> colorsTemplate)
	{
		this.colorsTemplate = colorsTemplate;
		return this;
	}

	public List<String> getColorsCharts()
	{
		return colorsCharts;
	}

	public ClientConfiguration setColorsCharts(List<String> colorsCharts)
	{
		this.colorsCharts = colorsCharts;
		return this;
	}

	public List<String> getHiddenPages()
	{
		return hiddenPages;
	}

	public ClientConfiguration setHiddenPages(List<String> hiddenPages)
	{
		this.hiddenPages = hiddenPages;
		return this;
	}

	public AuthenticationMode getAuthMode()
	{
		return authMode;
	}

	public ClientConfiguration setAuthMode(AuthenticationMode authMode)
	{
		this.authMode = authMode;
		return this;
	}

	public Boolean getRegistrationEnabled()
	{
		return registrationEnabled;
	}

	public ClientConfiguration setRegistrationEnabled(Boolean registrationEnabled)
	{
		this.registrationEnabled = registrationEnabled;
		return this;
	}

	public Boolean getShowGdprNotification()
	{
		return showGdprNotification;
	}

	public ClientConfiguration setShowGdprNotification(Boolean showGdprNotification)
	{
		this.showGdprNotification = showGdprNotification;
		return this;
	}

	public String getGoogleAnalyticsKey()
	{
		return googleAnalyticsKey;
	}

	public ClientConfiguration setGoogleAnalyticsKey(String googleAnalyticsKey)
	{
		this.googleAnalyticsKey = googleAnalyticsKey;
		return this;
	}

	public Boolean getCommentsEnabled()
	{
		return commentsEnabled;
	}

	public ClientConfiguration setCommentsEnabled(Boolean commentsEnabled)
	{
		this.commentsEnabled = commentsEnabled;
		return this;
	}

	public List<String> getDashboardCategories()
	{
		return dashboardCategories;
	}

	public ClientConfiguration setDashboardCategories(List<String> dashboardCategories)
	{
		this.dashboardCategories = dashboardCategories;
		return this;
	}
}