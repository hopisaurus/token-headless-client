package com.bakkenbaeck.token.headless;


public final class TokenHeadlessClientConfiguration {
    private String address;
    private String server;
    private String token_ethereum_service_url;
    private String token_id_service_url;
    private String seed;
    private String store;
    private String trust_store;
    private String username;
    private String name;
    private String avatar;
    private RedisConfiguration redis;
    private PostgresConfiguration postgres;

    public String getAddress() {
        return (address != null) ? address : System.getenv("TOKEN_APP_ID");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getSeed() {
        return (seed != null) ? seed : System.getenv("TOKEN_APP_SEED");
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getTrust_store() {
        return trust_store;
    }

    public void setTrust_store(String trust_store) {
        this.trust_store = trust_store;
    }

    public String getUsername() {
        return (username != null) ? username : System.getenv("TOKEN_APP_USERNAME");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return (name != null) ? name : System.getenv("TOKEN_APP_NAME");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return (avatar != null) ? avatar : System.getenv("TOKEN_APP_AVATAR");
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public RedisConfiguration getRedis() {
        return redis;
    }

    public void setRedis(RedisConfiguration redis) {
        this.redis = redis;
    }

    public PostgresConfiguration getPostgres() {
        return postgres;
    }

    public void setPostgres(PostgresConfiguration postgres) {
        this.postgres = postgres;
    }

    public String getToken_ethereum_service_url() {
        return token_ethereum_service_url;
    }

    public void setToken_ethereum_service_url(String token_ethereum_service_url) {
        this.token_ethereum_service_url = token_ethereum_service_url;
    }

    public String getToken_id_service_url() {
        return token_id_service_url;
    }

    public void setToken_id_service_url(String token_id_service_url) {
        this.token_id_service_url = token_id_service_url;
    }
}
