package io.honeymon.boot.byl.core;

import java.lang.System;

/**
 * * Component 는 Configuration 클래스에서 불러오는 곳이 없는 경우 선언
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lio/honeymon/boot/byl/core/HoneymonProperties;", "", "()V", "age", "", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "homesite", "getHomesite", "setHomesite", "name", "getName", "setName", "bootiful-core"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "io.honeymon")
@org.springframework.stereotype.Component()
public final class HoneymonProperties {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String age;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String homesite;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomesite() {
        return null;
    }
    
    public final void setHomesite(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public HoneymonProperties() {
        super();
    }
}