package com.xinzhihui.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by ange on 2017/11/27.
 */
@Aspect
public class ToastAspect {

    @Pointcut("execution(@com.example.ToastCut * *(..))")//方法切入点
    public void methodAnnotated() {
    }

    @Around("methodAnnotated()")//在连接点进行方法替换
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.d("ToastAspect","aroundJoinPoint");
        joinPoint.proceed();//执行原方法
    }








}
