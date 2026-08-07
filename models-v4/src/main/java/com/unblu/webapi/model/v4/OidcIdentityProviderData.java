
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data transfer object for &#x60;OidcIdentityProvider&#x60;. Contains all provider fields except the client secret, which is managed separately
 * via&#x60;OidcIdentityProviderSecretContainer&#x60;.
 */
@ApiModel(description = "Data transfer object for `OidcIdentityProvider`. Contains all provider fields except the client secret, which is managed separately via`OidcIdentityProviderSecretContainer`.")

@JsonPropertyOrder({
	OidcIdentityProviderData.JSON_PROPERTY_$_TYPE,
	OidcIdentityProviderData.JSON_PROPERTY_ID,
	OidcIdentityProviderData.JSON_PROPERTY_ACCOUNT_ID,
	OidcIdentityProviderData.JSON_PROPERTY_CREATION_TIMESTAMP,
	OidcIdentityProviderData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	OidcIdentityProviderData.JSON_PROPERTY_VERSION,
	OidcIdentityProviderData.JSON_PROPERTY_NAME,
	OidcIdentityProviderData.JSON_PROPERTY_LOGO_IMAGE,
	OidcIdentityProviderData.JSON_PROPERTY_PATH,
	OidcIdentityProviderData.JSON_PROPERTY_CLIENT_ID,
	OidcIdentityProviderData.JSON_PROPERTY_ISSUER_URL,
	OidcIdentityProviderData.JSON_PROPERTY_USE_AUTO_DISCOVERY,
	OidcIdentityProviderData.JSON_PROPERTY_AUTHORIZATION_ENDPOINT,
	OidcIdentityProviderData.JSON_PROPERTY_TOKEN_ENDPOINT,
	OidcIdentityProviderData.JSON_PROPERTY_JWKS_URI,
	OidcIdentityProviderData.JSON_PROPERTY_ENABLE_SSO_LOGOUT,
	OidcIdentityProviderData.JSON_PROPERTY_POST_LOGOUT_REDIRECT_URL,
	OidcIdentityProviderData.JSON_PROPERTY_USER_NOT_FOUND_STRATEGY,
	OidcIdentityProviderData.JSON_PROPERTY_USER_UPDATE_STRATEGY,
	OidcIdentityProviderData.JSON_PROPERTY_USER_MIGRATION_STRATEGY,
	OidcIdentityProviderData.JSON_PROPERTY_ALLOW_UNVERIFIED_EMAIL,
	OidcIdentityProviderData.JSON_PROPERTY_SCOPE,
	OidcIdentityProviderData.JSON_PROPERTY_AUTHORIZATION_URL_PARAMETERS,
	OidcIdentityProviderData.JSON_PROPERTY_DISABLE_PKCE,
	OidcIdentityProviderData.JSON_PROPERTY_CLAIMS_SOURCE,
	OidcIdentityProviderData.JSON_PROPERTY_ALGORITHMS,
	OidcIdentityProviderData.JSON_PROPERTY_REFRESH_INTERVAL,
	OidcIdentityProviderData.JSON_PROPERTY_END_SESSION_ENDPOINT,
	OidcIdentityProviderData.JSON_PROPERTY_LOG_CLAIMS,
	OidcIdentityProviderData.JSON_PROPERTY_CLAIM_MAPPINGS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcIdentityProviderData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCIDENTITYPROVIDERDATA("OidcIdentityProviderData");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.OIDCIDENTITYPROVIDERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCIDENTITYPROVIDERDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_LOGO_IMAGE = "logoImage";
	@JsonProperty(JSON_PROPERTY_LOGO_IMAGE)
	private ExpandableField<Image> logoImage = null;

	public static final String JSON_PROPERTY_PATH = "path";
	@JsonProperty(JSON_PROPERTY_PATH)
	private String path;

	public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
	@JsonProperty(JSON_PROPERTY_CLIENT_ID)
	private String clientId;

	public static final String JSON_PROPERTY_ISSUER_URL = "issuerUrl";
	@JsonProperty(JSON_PROPERTY_ISSUER_URL)
	private String issuerUrl;

	public static final String JSON_PROPERTY_USE_AUTO_DISCOVERY = "useAutoDiscovery";
	@JsonProperty(JSON_PROPERTY_USE_AUTO_DISCOVERY)
	private Boolean useAutoDiscovery;

	public static final String JSON_PROPERTY_AUTHORIZATION_ENDPOINT = "authorizationEndpoint";
	@JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENDPOINT)
	private String authorizationEndpoint;

	public static final String JSON_PROPERTY_TOKEN_ENDPOINT = "tokenEndpoint";
	@JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT)
	private String tokenEndpoint;

	public static final String JSON_PROPERTY_JWKS_URI = "jwksUri";
	@JsonProperty(JSON_PROPERTY_JWKS_URI)
	private String jwksUri;

	public static final String JSON_PROPERTY_ENABLE_SSO_LOGOUT = "enableSsoLogout";
	@JsonProperty(JSON_PROPERTY_ENABLE_SSO_LOGOUT)
	private Boolean enableSsoLogout;

	public static final String JSON_PROPERTY_POST_LOGOUT_REDIRECT_URL = "postLogoutRedirectUrl";
	@JsonProperty(JSON_PROPERTY_POST_LOGOUT_REDIRECT_URL)
	private String postLogoutRedirectUrl;

	public static final String JSON_PROPERTY_USER_NOT_FOUND_STRATEGY = "userNotFoundStrategy";
	@JsonProperty(JSON_PROPERTY_USER_NOT_FOUND_STRATEGY)
	private EOidcUserNotFoundStrategy userNotFoundStrategy;

	public static final String JSON_PROPERTY_USER_UPDATE_STRATEGY = "userUpdateStrategy";
	@JsonProperty(JSON_PROPERTY_USER_UPDATE_STRATEGY)
	private EOidcUserUpdateStrategy userUpdateStrategy;

	public static final String JSON_PROPERTY_USER_MIGRATION_STRATEGY = "userMigrationStrategy";
	@JsonProperty(JSON_PROPERTY_USER_MIGRATION_STRATEGY)
	private EOidcUserMigrationStrategy userMigrationStrategy;

	public static final String JSON_PROPERTY_ALLOW_UNVERIFIED_EMAIL = "allowUnverifiedEmail";
	@JsonProperty(JSON_PROPERTY_ALLOW_UNVERIFIED_EMAIL)
	private Boolean allowUnverifiedEmail;

	public static final String JSON_PROPERTY_SCOPE = "scope";
	@JsonProperty(JSON_PROPERTY_SCOPE)
	private List<String> scope = null;

	public static final String JSON_PROPERTY_AUTHORIZATION_URL_PARAMETERS = "authorizationUrlParameters";
	@JsonProperty(JSON_PROPERTY_AUTHORIZATION_URL_PARAMETERS)
	private List<OidcAuthorizationUrlParameter> authorizationUrlParameters = null;

	public static final String JSON_PROPERTY_DISABLE_PKCE = "disablePkce";
	@JsonProperty(JSON_PROPERTY_DISABLE_PKCE)
	private Boolean disablePkce;

	public static final String JSON_PROPERTY_CLAIMS_SOURCE = "claimsSource";
	@JsonProperty(JSON_PROPERTY_CLAIMS_SOURCE)
	private EOidcClaimsSource claimsSource;

	public static final String JSON_PROPERTY_ALGORITHMS = "algorithms";
	@JsonProperty(JSON_PROPERTY_ALGORITHMS)
	private List<EOidcSignatureAlgorithm> algorithms = null;

	public static final String JSON_PROPERTY_REFRESH_INTERVAL = "refreshInterval";
	@JsonProperty(JSON_PROPERTY_REFRESH_INTERVAL)
	private Integer refreshInterval;

	public static final String JSON_PROPERTY_END_SESSION_ENDPOINT = "endSessionEndpoint";
	@JsonProperty(JSON_PROPERTY_END_SESSION_ENDPOINT)
	private String endSessionEndpoint;

	public static final String JSON_PROPERTY_LOG_CLAIMS = "logClaims";
	@JsonProperty(JSON_PROPERTY_LOG_CLAIMS)
	private Boolean logClaims;

	public static final String JSON_PROPERTY_CLAIM_MAPPINGS = "claimMappings";
	@JsonProperty(JSON_PROPERTY_CLAIM_MAPPINGS)
	private List<OidcClaimMapping> claimMappings = null;

	public OidcIdentityProviderData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public OidcIdentityProviderData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OidcIdentityProviderData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public OidcIdentityProviderData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Get creationTimestamp
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public OidcIdentityProviderData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Get modificationTimestamp
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public OidcIdentityProviderData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Get version
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public OidcIdentityProviderData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The display name of the OIDC identity provider
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The display name of the OIDC identity provider")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OidcIdentityProviderData logoImage(ExpandableField<Image> logoImage) {
		this.logoImage = logoImage;
		return this;
	}

	/**
	 * Image of the entity: ID that can be expanded.
	 * 
	 * @return logoImage
	 **/
	@ApiModelProperty(value = "Image of the entity: ID that can be expanded.")
	public ExpandableField<Image> getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(ExpandableField<Image> logoImage) {
		this.logoImage = logoImage;
	}

	public OidcIdentityProviderData path(String path) {
		this.path = path;
		return this;
	}

	/**
	 * The path of the OIDC identity provider
	 * 
	 * @return path
	 **/
	@ApiModelProperty(value = "The path of the OIDC identity provider")
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public OidcIdentityProviderData clientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	/**
	 * The OIDC client ID
	 * 
	 * @return clientId
	 **/
	@ApiModelProperty(value = "The OIDC client ID")
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public OidcIdentityProviderData issuerUrl(String issuerUrl) {
		this.issuerUrl = issuerUrl;
		return this;
	}

	/**
	 * The OIDC issuer URL
	 * 
	 * @return issuerUrl
	 **/
	@ApiModelProperty(value = "The OIDC issuer URL")
	public String getIssuerUrl() {
		return issuerUrl;
	}

	public void setIssuerUrl(String issuerUrl) {
		this.issuerUrl = issuerUrl;
	}

	public OidcIdentityProviderData useAutoDiscovery(Boolean useAutoDiscovery) {
		this.useAutoDiscovery = useAutoDiscovery;
		return this;
	}

	/**
	 * Whether to use OIDC auto-discovery to resolve endpoints. Optional, defaults to &#x60;false&#x60; when &#x60;null&#x60;.
	 * 
	 * @return useAutoDiscovery
	 **/
	@ApiModelProperty(value = "Whether to use OIDC auto-discovery to resolve endpoints. Optional, defaults to `false` when `null`.")
	public Boolean isUseAutoDiscovery() {
		return useAutoDiscovery;
	}

	public void setUseAutoDiscovery(Boolean useAutoDiscovery) {
		this.useAutoDiscovery = useAutoDiscovery;
	}

	public OidcIdentityProviderData authorizationEndpoint(String authorizationEndpoint) {
		this.authorizationEndpoint = authorizationEndpoint;
		return this;
	}

	/**
	 * The authorization endpoint URL. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.
	 * 
	 * @return authorizationEndpoint
	 **/
	@ApiModelProperty(value = "The authorization endpoint URL. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.")
	public String getAuthorizationEndpoint() {
		return authorizationEndpoint;
	}

	public void setAuthorizationEndpoint(String authorizationEndpoint) {
		this.authorizationEndpoint = authorizationEndpoint;
	}

	public OidcIdentityProviderData tokenEndpoint(String tokenEndpoint) {
		this.tokenEndpoint = tokenEndpoint;
		return this;
	}

	/**
	 * The token endpoint URL. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.
	 * 
	 * @return tokenEndpoint
	 **/
	@ApiModelProperty(value = "The token endpoint URL. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.")
	public String getTokenEndpoint() {
		return tokenEndpoint;
	}

	public void setTokenEndpoint(String tokenEndpoint) {
		this.tokenEndpoint = tokenEndpoint;
	}

	public OidcIdentityProviderData jwksUri(String jwksUri) {
		this.jwksUri = jwksUri;
		return this;
	}

	/**
	 * The JWKS URI for token verification. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.
	 * 
	 * @return jwksUri
	 **/
	@ApiModelProperty(value = "The JWKS URI for token verification. Filled by the user when auto-discovery is disabled, or populated via auto-discovery before persisting.")
	public String getJwksUri() {
		return jwksUri;
	}

	public void setJwksUri(String jwksUri) {
		this.jwksUri = jwksUri;
	}

	public OidcIdentityProviderData enableSsoLogout(Boolean enableSsoLogout) {
		this.enableSsoLogout = enableSsoLogout;
		return this;
	}

	/**
	 * Whether SSO logout via the identity provider is enabled. Optional, defaults to &#x60;false&#x60; when &#x60;null&#x60;.
	 * 
	 * @return enableSsoLogout
	 **/
	@ApiModelProperty(value = "Whether SSO logout via the identity provider is enabled. Optional, defaults to `false` when `null`.")
	public Boolean isEnableSsoLogout() {
		return enableSsoLogout;
	}

	public void setEnableSsoLogout(Boolean enableSsoLogout) {
		this.enableSsoLogout = enableSsoLogout;
	}

	public OidcIdentityProviderData postLogoutRedirectUrl(String postLogoutRedirectUrl) {
		this.postLogoutRedirectUrl = postLogoutRedirectUrl;
		return this;
	}

	/**
	 * The post-logout redirect URL. Required when SSO logout is enabled; must not be set otherwise.
	 * 
	 * @return postLogoutRedirectUrl
	 **/
	@ApiModelProperty(value = "The post-logout redirect URL. Required when SSO logout is enabled; must not be set otherwise.")
	public String getPostLogoutRedirectUrl() {
		return postLogoutRedirectUrl;
	}

	public void setPostLogoutRedirectUrl(String postLogoutRedirectUrl) {
		this.postLogoutRedirectUrl = postLogoutRedirectUrl;
	}

	public OidcIdentityProviderData userNotFoundStrategy(EOidcUserNotFoundStrategy userNotFoundStrategy) {
		this.userNotFoundStrategy = userNotFoundStrategy;
		return this;
	}

	/**
	 * Get userNotFoundStrategy
	 * 
	 * @return userNotFoundStrategy
	 **/
	@ApiModelProperty(value = "")
	public EOidcUserNotFoundStrategy getUserNotFoundStrategy() {
		return userNotFoundStrategy;
	}

	public void setUserNotFoundStrategy(EOidcUserNotFoundStrategy userNotFoundStrategy) {
		this.userNotFoundStrategy = userNotFoundStrategy;
	}

	public OidcIdentityProviderData userUpdateStrategy(EOidcUserUpdateStrategy userUpdateStrategy) {
		this.userUpdateStrategy = userUpdateStrategy;
		return this;
	}

	/**
	 * Get userUpdateStrategy
	 * 
	 * @return userUpdateStrategy
	 **/
	@ApiModelProperty(value = "")
	public EOidcUserUpdateStrategy getUserUpdateStrategy() {
		return userUpdateStrategy;
	}

	public void setUserUpdateStrategy(EOidcUserUpdateStrategy userUpdateStrategy) {
		this.userUpdateStrategy = userUpdateStrategy;
	}

	public OidcIdentityProviderData userMigrationStrategy(EOidcUserMigrationStrategy userMigrationStrategy) {
		this.userMigrationStrategy = userMigrationStrategy;
		return this;
	}

	/**
	 * Get userMigrationStrategy
	 * 
	 * @return userMigrationStrategy
	 **/
	@ApiModelProperty(value = "")
	public EOidcUserMigrationStrategy getUserMigrationStrategy() {
		return userMigrationStrategy;
	}

	public void setUserMigrationStrategy(EOidcUserMigrationStrategy userMigrationStrategy) {
		this.userMigrationStrategy = userMigrationStrategy;
	}

	public OidcIdentityProviderData allowUnverifiedEmail(Boolean allowUnverifiedEmail) {
		this.allowUnverifiedEmail = allowUnverifiedEmail;
		return this;
	}

	/**
	 * Whether to accept logins when the OIDC token&#39;s &#x60;email_verified&#x60; claim is missing or &#x60;false&#x60;. Has no effect when the &#x60;email&#x60;
	 * claim is not mapped. Optional, defaults to &#x60;false&#x60; when &#x60;null&#x60;.
	 * 
	 * @return allowUnverifiedEmail
	 **/
	@ApiModelProperty(value = "Whether to accept logins when the OIDC token's `email_verified` claim is missing or `false`. Has no effect when the `email` claim is not mapped. Optional, defaults to `false` when `null`.")
	public Boolean isAllowUnverifiedEmail() {
		return allowUnverifiedEmail;
	}

	public void setAllowUnverifiedEmail(Boolean allowUnverifiedEmail) {
		this.allowUnverifiedEmail = allowUnverifiedEmail;
	}

	public OidcIdentityProviderData scope(List<String> scope) {
		this.scope = scope;
		return this;
	}

	public OidcIdentityProviderData addScopeItem(String scopeItem) {
		if (this.scope == null) {
			this.scope = new ArrayList<>();
		}
		this.scope.add(scopeItem);
		return this;
	}

	/**
	 * The OIDC scopes to request during authentication
	 * 
	 * @return scope
	 **/
	@ApiModelProperty(value = "The OIDC scopes to request during authentication")
	public List<String> getScope() {
		return scope;
	}

	public void setScope(List<String> scope) {
		this.scope = scope;
	}

	public OidcIdentityProviderData authorizationUrlParameters(List<OidcAuthorizationUrlParameter> authorizationUrlParameters) {
		this.authorizationUrlParameters = authorizationUrlParameters;
		return this;
	}

	public OidcIdentityProviderData addAuthorizationUrlParametersItem(OidcAuthorizationUrlParameter authorizationUrlParametersItem) {
		if (this.authorizationUrlParameters == null) {
			this.authorizationUrlParameters = new ArrayList<>();
		}
		this.authorizationUrlParameters.add(authorizationUrlParametersItem);
		return this;
	}

	/**
	 * Additional parameters appended to the OIDC authorization request URL, after any parameters already present on the configured authorization endpoint. Key and
	 * value are provided unencoded; Unblu URL-encodes them when building the authorization request.
	 * 
	 * @return authorizationUrlParameters
	 **/
	@ApiModelProperty(value = "Additional parameters appended to the OIDC authorization request URL, after any parameters already present on the configured authorization endpoint. Key and value are provided unencoded; Unblu URL-encodes them when building the authorization request.")
	public List<OidcAuthorizationUrlParameter> getAuthorizationUrlParameters() {
		return authorizationUrlParameters;
	}

	public void setAuthorizationUrlParameters(List<OidcAuthorizationUrlParameter> authorizationUrlParameters) {
		this.authorizationUrlParameters = authorizationUrlParameters;
	}

	public OidcIdentityProviderData disablePkce(Boolean disablePkce) {
		this.disablePkce = disablePkce;
		return this;
	}

	/**
	 * Whether PKCE (Proof Key for Code Exchange) is disabled for the authorization code flow. PKCE is on by default and should only be disabled for legacy identity
	 * providers that do not tolerate the &#x60;code_challenge&#x60;/&#x60;code_verifier&#x60; parameters. Optional, defaults to &#x60;false&#x60; when
	 * &#x60;null&#x60;.
	 * 
	 * @return disablePkce
	 **/
	@ApiModelProperty(value = "Whether PKCE (Proof Key for Code Exchange) is disabled for the authorization code flow. PKCE is on by default and should only be disabled for legacy identity providers that do not tolerate the `code_challenge`/`code_verifier` parameters. Optional, defaults to `false` when `null`.")
	public Boolean isDisablePkce() {
		return disablePkce;
	}

	public void setDisablePkce(Boolean disablePkce) {
		this.disablePkce = disablePkce;
	}

	public OidcIdentityProviderData claimsSource(EOidcClaimsSource claimsSource) {
		this.claimsSource = claimsSource;
		return this;
	}

	/**
	 * Get claimsSource
	 * 
	 * @return claimsSource
	 **/
	@ApiModelProperty(value = "")
	public EOidcClaimsSource getClaimsSource() {
		return claimsSource;
	}

	public void setClaimsSource(EOidcClaimsSource claimsSource) {
		this.claimsSource = claimsSource;
	}

	public OidcIdentityProviderData algorithms(List<EOidcSignatureAlgorithm> algorithms) {
		this.algorithms = algorithms;
		return this;
	}

	public OidcIdentityProviderData addAlgorithmsItem(EOidcSignatureAlgorithm algorithmsItem) {
		if (this.algorithms == null) {
			this.algorithms = new ArrayList<>();
		}
		this.algorithms.add(algorithmsItem);
		return this;
	}

	/**
	 * The JWS algorithms accepted when verifying the signatures of the tokens issued by the identity provider
	 * 
	 * @return algorithms
	 **/
	@ApiModelProperty(value = "The JWS algorithms accepted when verifying the signatures of the tokens issued by the identity provider")
	public List<EOidcSignatureAlgorithm> getAlgorithms() {
		return algorithms;
	}

	public void setAlgorithms(List<EOidcSignatureAlgorithm> algorithms) {
		this.algorithms = algorithms;
	}

	public OidcIdentityProviderData refreshInterval(Integer refreshInterval) {
		this.refreshInterval = refreshInterval;
		return this;
	}

	/**
	 * The interval in minutes at which OIDC tokens are refreshed
	 * 
	 * @return refreshInterval
	 **/
	@ApiModelProperty(value = "The interval in minutes at which OIDC tokens are refreshed")
	public Integer getRefreshInterval() {
		return refreshInterval;
	}

	public void setRefreshInterval(Integer refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public OidcIdentityProviderData endSessionEndpoint(String endSessionEndpoint) {
		this.endSessionEndpoint = endSessionEndpoint;
		return this;
	}

	/**
	 * The end session endpoint URL for OIDC logout
	 * 
	 * @return endSessionEndpoint
	 **/
	@ApiModelProperty(value = "The end session endpoint URL for OIDC logout")
	public String getEndSessionEndpoint() {
		return endSessionEndpoint;
	}

	public void setEndSessionEndpoint(String endSessionEndpoint) {
		this.endSessionEndpoint = endSessionEndpoint;
	}

	public OidcIdentityProviderData logClaims(Boolean logClaims) {
		this.logClaims = logClaims;
		return this;
	}

	/**
	 * Whether OIDC claims received from the identity provider should be logged. Optional, defaults to &#x60;false&#x60; when &#x60;null&#x60;.
	 * 
	 * @return logClaims
	 **/
	@ApiModelProperty(value = "Whether OIDC claims received from the identity provider should be logged. Optional, defaults to `false` when `null`.")
	public Boolean isLogClaims() {
		return logClaims;
	}

	public void setLogClaims(Boolean logClaims) {
		this.logClaims = logClaims;
	}

	public OidcIdentityProviderData claimMappings(List<OidcClaimMapping> claimMappings) {
		this.claimMappings = claimMappings;
		return this;
	}

	public OidcIdentityProviderData addClaimMappingsItem(OidcClaimMapping claimMappingsItem) {
		if (this.claimMappings == null) {
			this.claimMappings = new ArrayList<>();
		}
		this.claimMappings.add(claimMappingsItem);
		return this;
	}

	/**
	 * Get claimMappings
	 * 
	 * @return claimMappings
	 **/
	@ApiModelProperty(value = "")
	public List<OidcClaimMapping> getClaimMappings() {
		return claimMappings;
	}

	public void setClaimMappings(List<OidcClaimMapping> claimMappings) {
		this.claimMappings = claimMappings;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcIdentityProviderData oidcIdentityProviderData = (OidcIdentityProviderData) o;
		return Objects.equals(this.$type, oidcIdentityProviderData.$type) &&
				Objects.equals(this.id, oidcIdentityProviderData.id) &&
				Objects.equals(this.accountId, oidcIdentityProviderData.accountId) &&
				Objects.equals(this.creationTimestamp, oidcIdentityProviderData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, oidcIdentityProviderData.modificationTimestamp) &&
				Objects.equals(this.version, oidcIdentityProviderData.version) &&
				Objects.equals(this.name, oidcIdentityProviderData.name) &&
				Objects.equals(this.logoImage, oidcIdentityProviderData.logoImage) &&
				Objects.equals(this.path, oidcIdentityProviderData.path) &&
				Objects.equals(this.clientId, oidcIdentityProviderData.clientId) &&
				Objects.equals(this.issuerUrl, oidcIdentityProviderData.issuerUrl) &&
				Objects.equals(this.useAutoDiscovery, oidcIdentityProviderData.useAutoDiscovery) &&
				Objects.equals(this.authorizationEndpoint, oidcIdentityProviderData.authorizationEndpoint) &&
				Objects.equals(this.tokenEndpoint, oidcIdentityProviderData.tokenEndpoint) &&
				Objects.equals(this.jwksUri, oidcIdentityProviderData.jwksUri) &&
				Objects.equals(this.enableSsoLogout, oidcIdentityProviderData.enableSsoLogout) &&
				Objects.equals(this.postLogoutRedirectUrl, oidcIdentityProviderData.postLogoutRedirectUrl) &&
				Objects.equals(this.userNotFoundStrategy, oidcIdentityProviderData.userNotFoundStrategy) &&
				Objects.equals(this.userUpdateStrategy, oidcIdentityProviderData.userUpdateStrategy) &&
				Objects.equals(this.userMigrationStrategy, oidcIdentityProviderData.userMigrationStrategy) &&
				Objects.equals(this.allowUnverifiedEmail, oidcIdentityProviderData.allowUnverifiedEmail) &&
				Objects.equals(this.scope, oidcIdentityProviderData.scope) &&
				Objects.equals(this.authorizationUrlParameters, oidcIdentityProviderData.authorizationUrlParameters) &&
				Objects.equals(this.disablePkce, oidcIdentityProviderData.disablePkce) &&
				Objects.equals(this.claimsSource, oidcIdentityProviderData.claimsSource) &&
				Objects.equals(this.algorithms, oidcIdentityProviderData.algorithms) &&
				Objects.equals(this.refreshInterval, oidcIdentityProviderData.refreshInterval) &&
				Objects.equals(this.endSessionEndpoint, oidcIdentityProviderData.endSessionEndpoint) &&
				Objects.equals(this.logClaims, oidcIdentityProviderData.logClaims) &&
				Objects.equals(this.claimMappings, oidcIdentityProviderData.claimMappings);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, creationTimestamp, modificationTimestamp, version, name, logoImage, path, clientId, issuerUrl, useAutoDiscovery, authorizationEndpoint, tokenEndpoint, jwksUri, enableSsoLogout, postLogoutRedirectUrl, userNotFoundStrategy, userUpdateStrategy, userMigrationStrategy, allowUnverifiedEmail, scope, authorizationUrlParameters, disablePkce, claimsSource, algorithms, refreshInterval, endSessionEndpoint, logClaims, claimMappings);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcIdentityProviderData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    logoImage: ").append(toIndentedString(logoImage)).append("\n");
		sb.append("    path: ").append(toIndentedString(path)).append("\n");
		sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
		sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
		sb.append("    useAutoDiscovery: ").append(toIndentedString(useAutoDiscovery)).append("\n");
		sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
		sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
		sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
		sb.append("    enableSsoLogout: ").append(toIndentedString(enableSsoLogout)).append("\n");
		sb.append("    postLogoutRedirectUrl: ").append(toIndentedString(postLogoutRedirectUrl)).append("\n");
		sb.append("    userNotFoundStrategy: ").append(toIndentedString(userNotFoundStrategy)).append("\n");
		sb.append("    userUpdateStrategy: ").append(toIndentedString(userUpdateStrategy)).append("\n");
		sb.append("    userMigrationStrategy: ").append(toIndentedString(userMigrationStrategy)).append("\n");
		sb.append("    allowUnverifiedEmail: ").append(toIndentedString(allowUnverifiedEmail)).append("\n");
		sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
		sb.append("    authorizationUrlParameters: ").append(toIndentedString(authorizationUrlParameters)).append("\n");
		sb.append("    disablePkce: ").append(toIndentedString(disablePkce)).append("\n");
		sb.append("    claimsSource: ").append(toIndentedString(claimsSource)).append("\n");
		sb.append("    algorithms: ").append(toIndentedString(algorithms)).append("\n");
		sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
		sb.append("    endSessionEndpoint: ").append(toIndentedString(endSessionEndpoint)).append("\n");
		sb.append("    logClaims: ").append(toIndentedString(logClaims)).append("\n");
		sb.append("    claimMappings: ").append(toIndentedString(claimMappings)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
