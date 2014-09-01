package com.blogspot.mstachniuk.singletoninjava;

import org.powermock.core.spi.PowerMockPolicy;
import org.powermock.mockpolicies.MockPolicyClassLoadingSettings;
import org.powermock.mockpolicies.MockPolicyInterceptionSettings;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ElvisMockPolicy implements PowerMockPolicy {

    @Override
    public void applyClassLoadingPolicy(MockPolicyClassLoadingSettings settings) {
        settings.addFullyQualifiedNamesOfClassesToLoadByMockClassloader("com.blogspot.mstachniuk.singletoninjava.Elvis");
    }

    @Override
    public void applyInterceptionPolicy(MockPolicyInterceptionSettings settings) {
        Method method = Whitebox.getMethod(Elvis.class, "howOldIsElvisNow");
        settings.proxyMethod(method, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return 1.0;
            }
        });
    }
}
