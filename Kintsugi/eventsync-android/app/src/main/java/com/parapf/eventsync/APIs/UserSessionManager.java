package com.parapf.eventsync.APIs;

public class UserSessionManager {

    private static UserSessionManager INSTANCE;

    // In-memory fields (NOT stored anywhere)
    private String token;
    private String expiresAt;
    private String tokenCreatedAt;
    private String tokenUpdatedAt;
    private String ipAddress;
    private String userAgent;
    private String userId;
    private String sessionId;

    private String name;
    private String email;
    private boolean emailVerified;
    private String image;
    private String userCreatedAt;
    private String userUpdatedAt;
    private String role;
    private boolean banned;
    private String banReason;
    private String banExpires;

    private boolean loggedIn = false;

    private UserSessionManager() {}

    public static synchronized UserSessionManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserSessionManager();
        }
        return INSTANCE;
    }

    // ---------------------------------------------------
    //                  SAVE SESSION
    // ---------------------------------------------------
    public void saveSession(
            String token,
            String expiresAt,
            String tokenCreatedAt,
            String tokenUpdatedAt,
            String ipAddress,
            String userAgent,
            String userId,
            String sessionId,

            String name,
            String email,
            boolean emailVerified,
            String image,
            String userCreatedAt,
            String userUpdatedAt,
            String role,
            boolean banned,
            String banReason,
            String banExpires
    ) {
        this.token = token;
        this.expiresAt = expiresAt;
        this.tokenCreatedAt = tokenCreatedAt;
        this.tokenUpdatedAt = tokenUpdatedAt;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.userId = userId;
        this.sessionId = sessionId;

        this.name = name;
        this.email = email;
        this.emailVerified = emailVerified;
        this.image = image;
        this.userCreatedAt = userCreatedAt;
        this.userUpdatedAt = userUpdatedAt;
        this.role = role;
        this.banned = banned;
        this.banReason = banReason;
        this.banExpires = banExpires;

        this.loggedIn = true;
    }

    // ---------------------------------------------------
    //                    GETTERS
    // ---------------------------------------------------

    public String getToken() { return token; }
    public String getUserName() { return name; }
    public String getUserEmail() { return email; }
    public String getUserId() { return userId; }
    public String getUserRole() { return role; }
    public boolean isEmailVerified() { return emailVerified; }
    public boolean isBanned() { return banned; }
    public String getSessionId() { return sessionId; }
    public String getExpiresAt() { return expiresAt; }

    // ---------------------------------------------------
    //                    CHECKER
    // ---------------------------------------------------
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // ---------------------------------------------------
    //                    LOGOUT
    // ---------------------------------------------------
    public void clearSession() {
        INSTANCE = new UserSessionManager(); // fast reset
    }
}
