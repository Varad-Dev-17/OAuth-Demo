# 🔐 OAuth Demo

This project demonstrates secure authentication using OAuth 2.0 with multiple providers in Spring Boot.

## 🚀 Login Providers

- Google
- GitHub
- Facebook

The purpose of this project is to understand third-party authentication flow and integration using Spring Security OAuth2.

---

# 🔑 Getting Client ID & Client Secret

## 🔴 Google OAuth Setup

### Steps

1. Open Google Cloud Console
2. Create new project
3. Go to:

   - APIs & Services

4. Configure OAuth Consent Screen
5. Create OAuth Client ID
6. Select:

   - Web Application

7. Add Redirect URI:

```txt
http://localhost:8080/login/oauth2/code/google
```

8. Copy:

- Client ID
- Client Secret

---

## ⚫ GitHub OAuth Setup

### Steps

1. Open GitHub Developer Settings

2. Go to:

   - OAuth Apps

3. Click:

   - New OAuth App

4. Add:

### Homepage URL

```txt
http://localhost:8080
```

### Authorization Callback URL

```txt
http://localhost:8080/login/oauth2/code/github
```

5. Generate Client Secret

6. Copy:

- Client ID
- Client Secret

---

## 🔵 Facebook OAuth Setup

### Steps

1. Open Meta for Developers

2. Create App

3. Add:

   - Facebook Login

4. Select:

   - Web

5. Website URL:

```txt
http://localhost:8080
```

6. Add Redirect URI:

```txt
http://localhost:8080/login/oauth2/code/facebook
```

7. Copy:

- App ID
- App Secret

---

# 🌍 Environment Variables

```env
GOOGLE_CLIENT_ID=your_google_client_id
GOOGLE_CLIENT_SECRET=your_google_client_secret

GITHUB_CLIENT_ID=your_github_client_id
GITHUB_CLIENT_SECRET=your_github_client_secret

FACEBOOK_CLIENT_ID=your_facebook_client_id
FACEBOOK_CLIENT_SECRET=your_facebook_client_secret
```

---

# ⚙️ application.properties

```properties
# Google
spring.security.oauth2.client.registration.google.client-id=${GOOGLE_CLIENT_ID}
spring.security.oauth2.client.registration.google.client-secret=${GOOGLE_CLIENT_SECRET}

# GitHub
spring.security.oauth2.client.registration.github.client-id=${GITHUB_CLIENT_ID}
spring.security.oauth2.client.registration.github.client-secret=${GITHUB_CLIENT_SECRET}

# Facebook
spring.security.oauth2.client.registration.facebook.client-id=${FACEBOOK_CLIENT_ID}
spring.security.oauth2.client.registration.facebook.client-secret=${FACEBOOK_CLIENT_SECRET}
```
