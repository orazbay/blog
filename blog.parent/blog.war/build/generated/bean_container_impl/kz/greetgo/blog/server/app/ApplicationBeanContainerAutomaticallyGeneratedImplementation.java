package kz.greetgo.blog.server.app;
public final class ApplicationBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.blog.server.app.ApplicationBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.blog.server.beans.AppInitializer appInitializer() {
    return getter_native_AppInitializer_18.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.HelloController> cachedValue_native_HelloController_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.HelloController> getter_native_HelloController_1 = this::get_native_HelloController_1;
  private kz.greetgo.blog.controller.controller.HelloController get_native_HelloController_1 () {
    {
      kz.greetgo.blog.controller.controller.HelloController x = cachedValue_native_HelloController_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.HelloController x = cachedValue_native_HelloController_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.HelloController localValue = new kz.greetgo.blog.controller.controller.HelloController();
        localValue.testRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.HelloRegister>)(java.lang.Object)getter_native_HelloRegisterImpl_14;
        cachedValue_native_HelloController_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.LoginController> cachedValue_native_LoginController_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.LoginController> getter_native_LoginController_2 = this::get_native_LoginController_2;
  private kz.greetgo.blog.controller.controller.LoginController get_native_LoginController_2 () {
    {
      kz.greetgo.blog.controller.controller.LoginController x = cachedValue_native_LoginController_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.LoginController x = cachedValue_native_LoginController_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.LoginController localValue = new kz.greetgo.blog.controller.controller.LoginController();
        localValue.loginRegisterBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.login.LoginRegister>)(java.lang.Object)getter_native_LoginRegisterImpl_15;
        cachedValue_native_LoginController_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.PostsController> cachedValue_native_PostsController_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.PostsController> getter_native_PostsController_3 = this::get_native_PostsController_3;
  private kz.greetgo.blog.controller.controller.PostsController get_native_PostsController_3 () {
    {
      kz.greetgo.blog.controller.controller.PostsController x = cachedValue_native_PostsController_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.PostsController x = cachedValue_native_PostsController_3.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.PostsController localValue = new kz.greetgo.blog.controller.controller.PostsController();
        localValue.postRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.posts.PostsRegister>)(java.lang.Object)getter_native_PostRegisterImpl_16;
        cachedValue_native_PostsController_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.controller.controller.TestController> cachedValue_native_TestController_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.controller.TestController> getter_native_TestController_4 = this::get_native_TestController_4;
  private kz.greetgo.blog.controller.controller.TestController get_native_TestController_4 () {
    {
      kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.controller.controller.TestController x = cachedValue_native_TestController_4.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.controller.controller.TestController localValue = new kz.greetgo.blog.controller.controller.TestController();
        localValue.testRegisterBean = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.controller.register.TestRegister>)(java.lang.Object)getter_native_TestRegisterImpl_17;
        cachedValue_native_TestController_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.AllConfigFactory> cachedValue_native_AllConfigFactory_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.AllConfigFactory> getter_native_AllConfigFactory_5 = this::get_native_AllConfigFactory_5;
  private kz.greetgo.blog.register.beans.postgres.AllConfigFactory get_native_AllConfigFactory_5 () {
    {
      kz.greetgo.blog.register.beans.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.AllConfigFactory x = cachedValue_native_AllConfigFactory_5.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.AllConfigFactory localValue = new kz.greetgo.blog.register.beans.postgres.AllConfigFactory();
        cachedValue_native_AllConfigFactory_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.DaoImplFactory> cachedValue_native_DaoImplFactory_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DaoImplFactory> getter_native_DaoImplFactory_6 = this::get_native_DaoImplFactory_6;
  private kz.greetgo.blog.register.beans.postgres.DaoImplFactory get_native_DaoImplFactory_6 () {
    {
      kz.greetgo.blog.register.beans.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.DaoImplFactory x = cachedValue_native_DaoImplFactory_6.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.DaoImplFactory localValue = new kz.greetgo.blog.register.beans.postgres.DaoImplFactory();
        localValue.dbSessionFactory = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DbSessionFactory>)(java.lang.Object)getter_native_DbSessionFactory_7;
        cachedValue_native_DaoImplFactory_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.DbSessionFactory> cachedValue_native_DbSessionFactory_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.DbSessionFactory> getter_native_DbSessionFactory_7 = this::get_native_DbSessionFactory_7;
  private kz.greetgo.blog.register.beans.postgres.DbSessionFactory get_native_DbSessionFactory_7 () {
    {
      kz.greetgo.blog.register.beans.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.DbSessionFactory x = cachedValue_native_DbSessionFactory_7.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.DbSessionFactory localValue = new kz.greetgo.blog.register.beans.postgres.DbSessionFactory();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_9;
        localValue.afterInject();
        cachedValue_native_DbSessionFactory_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl> cachedValue_native_LiquibaseManagerImpl_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl> getter_native_LiquibaseManagerImpl_8 = this::get_native_LiquibaseManagerImpl_8;
  private kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl get_native_LiquibaseManagerImpl_8 () {
    {
      kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_8.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl localValue = new kz.greetgo.blog.register.beans.postgres.LiquibaseManagerImpl();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_9;
        cachedValue_native_LiquibaseManagerImpl_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.config.DbConfig> cachedValue_native_DbConfig_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.config.DbConfig> getter_native_DbConfig_9 = this::get_native_DbConfig_9;
  private kz.greetgo.blog.register.config.DbConfig get_native_DbConfig_9 () {
    {
      kz.greetgo.blog.register.config.DbConfig x = cachedValue_native_DbConfig_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.config.DbConfig x = cachedValue_native_DbConfig_9.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.config.DbConfig localValue = getter_native_AllConfigFactory_5.get().createDbConfig();
        cachedValue_native_DbConfig_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres> cachedValue_native_HelloDaoPostgres_10 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres> getter_native_HelloDaoPostgres_10 = this::get_native_HelloDaoPostgres_10;
  private kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres get_native_HelloDaoPostgres_10 () {
    {
      kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres x = cachedValue_native_HelloDaoPostgres_10.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres x = cachedValue_native_HelloDaoPostgres_10.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres localValue = (kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres) getter_native_DaoImplFactory_6.get().createBean(kz.greetgo.blog.register.dao.postgres.HelloDaoPostgres.class);
        cachedValue_native_HelloDaoPostgres_10.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres> cachedValue_native_PostsDaoPostgres_11 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres> getter_native_PostsDaoPostgres_11 = this::get_native_PostsDaoPostgres_11;
  private kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres get_native_PostsDaoPostgres_11 () {
    {
      kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres x = cachedValue_native_PostsDaoPostgres_11.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres x = cachedValue_native_PostsDaoPostgres_11.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres localValue = (kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres) getter_native_DaoImplFactory_6.get().createBean(kz.greetgo.blog.register.dao.postgres.PostsDaoPostgres.class);
        cachedValue_native_PostsDaoPostgres_11.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.dao.postgres.TestDaoPostgres> cachedValue_native_TestDaoPostgres_12 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.postgres.TestDaoPostgres> getter_native_TestDaoPostgres_12 = this::get_native_TestDaoPostgres_12;
  private kz.greetgo.blog.register.dao.postgres.TestDaoPostgres get_native_TestDaoPostgres_12 () {
    {
      kz.greetgo.blog.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_12.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.dao.postgres.TestDaoPostgres x = cachedValue_native_TestDaoPostgres_12.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.dao.postgres.TestDaoPostgres localValue = (kz.greetgo.blog.register.dao.postgres.TestDaoPostgres) getter_native_DaoImplFactory_6.get().createBean(kz.greetgo.blog.register.dao.postgres.TestDaoPostgres.class);
        cachedValue_native_TestDaoPostgres_12.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres> cachedValue_native_UsersDaoPostgres_13 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres> getter_native_UsersDaoPostgres_13 = this::get_native_UsersDaoPostgres_13;
  private kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres get_native_UsersDaoPostgres_13 () {
    {
      kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres x = cachedValue_native_UsersDaoPostgres_13.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres x = cachedValue_native_UsersDaoPostgres_13.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres localValue = (kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres) getter_native_DaoImplFactory_6.get().createBean(kz.greetgo.blog.register.dao.postgres.UsersDaoPostgres.class);
        cachedValue_native_UsersDaoPostgres_13.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.impl.HelloRegisterImpl> cachedValue_native_HelloRegisterImpl_14 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.impl.HelloRegisterImpl> getter_native_HelloRegisterImpl_14 = this::get_native_HelloRegisterImpl_14;
  private kz.greetgo.blog.register.impl.HelloRegisterImpl get_native_HelloRegisterImpl_14 () {
    {
      kz.greetgo.blog.register.impl.HelloRegisterImpl x = cachedValue_native_HelloRegisterImpl_14.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.impl.HelloRegisterImpl x = cachedValue_native_HelloRegisterImpl_14.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.impl.HelloRegisterImpl localValue = new kz.greetgo.blog.register.impl.HelloRegisterImpl();
        localValue.helloDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.HelloDao>)(java.lang.Object)getter_native_HelloDaoPostgres_10;
        cachedValue_native_HelloRegisterImpl_14.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.impl.LoginRegisterImpl> cachedValue_native_LoginRegisterImpl_15 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.impl.LoginRegisterImpl> getter_native_LoginRegisterImpl_15 = this::get_native_LoginRegisterImpl_15;
  private kz.greetgo.blog.register.impl.LoginRegisterImpl get_native_LoginRegisterImpl_15 () {
    {
      kz.greetgo.blog.register.impl.LoginRegisterImpl x = cachedValue_native_LoginRegisterImpl_15.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.impl.LoginRegisterImpl x = cachedValue_native_LoginRegisterImpl_15.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.impl.LoginRegisterImpl localValue = new kz.greetgo.blog.register.impl.LoginRegisterImpl();
        localValue.usersDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.UsersDao>)(java.lang.Object)getter_native_UsersDaoPostgres_13;
        cachedValue_native_LoginRegisterImpl_15.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.impl.PostRegisterImpl> cachedValue_native_PostRegisterImpl_16 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.impl.PostRegisterImpl> getter_native_PostRegisterImpl_16 = this::get_native_PostRegisterImpl_16;
  private kz.greetgo.blog.register.impl.PostRegisterImpl get_native_PostRegisterImpl_16 () {
    {
      kz.greetgo.blog.register.impl.PostRegisterImpl x = cachedValue_native_PostRegisterImpl_16.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.impl.PostRegisterImpl x = cachedValue_native_PostRegisterImpl_16.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.impl.PostRegisterImpl localValue = new kz.greetgo.blog.register.impl.PostRegisterImpl();
        localValue.postsDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.PostsDao>)(java.lang.Object)getter_native_PostsDaoPostgres_11;
        localValue.usersDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.UsersDao>)(java.lang.Object)getter_native_UsersDaoPostgres_13;
        cachedValue_native_PostRegisterImpl_16.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.register.impl.TestRegisterImpl> cachedValue_native_TestRegisterImpl_17 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.impl.TestRegisterImpl> getter_native_TestRegisterImpl_17 = this::get_native_TestRegisterImpl_17;
  private kz.greetgo.blog.register.impl.TestRegisterImpl get_native_TestRegisterImpl_17 () {
    {
      kz.greetgo.blog.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_17.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.register.impl.TestRegisterImpl x = cachedValue_native_TestRegisterImpl_17.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.register.impl.TestRegisterImpl localValue = new kz.greetgo.blog.register.impl.TestRegisterImpl();
        localValue.testDao = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.dao.TestDao>)(java.lang.Object)getter_native_TestDaoPostgres_12;
        cachedValue_native_TestRegisterImpl_17.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.AppInitializer> cachedValue_native_AppInitializer_18 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.AppInitializer> getter_native_AppInitializer_18 = this::get_native_AppInitializer_18;
  private kz.greetgo.blog.server.beans.AppInitializer get_native_AppInitializer_18 () {
    {
      kz.greetgo.blog.server.beans.AppInitializer x = cachedValue_native_AppInitializer_18.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.AppInitializer x = cachedValue_native_AppInitializer_18.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.AppInitializer localValue = new kz.greetgo.blog.server.beans.AppInitializer();
        localValue.controllerServlet = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.ControllerServlet>)(java.lang.Object)getter_native_ControllerServlet_19;
        localValue.liquibaseManager = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.register.util.LiquibaseManager>)(java.lang.Object)getter_native_LiquibaseManagerImpl_8;
        localValue.utf8AndTraceResetFilter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter>)(java.lang.Object)getter_native_Utf8AndTraceResetFilter_20;
        cachedValue_native_AppInitializer_18.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.ControllerServlet> cachedValue_native_ControllerServlet_19 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.ControllerServlet> getter_native_ControllerServlet_19 = this::get_native_ControllerServlet_19;
  private kz.greetgo.blog.server.beans.ControllerServlet get_native_ControllerServlet_19 () {
    {
      kz.greetgo.blog.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_19.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_19.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.ControllerServlet localValue = new kz.greetgo.blog.server.beans.ControllerServlet();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_22;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_WarEducationViews_21;
        cachedValue_native_ControllerServlet_19.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter> cachedValue_native_Utf8AndTraceResetFilter_20 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter> getter_native_Utf8AndTraceResetFilter_20 = this::get_native_Utf8AndTraceResetFilter_20;
  private kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter get_native_Utf8AndTraceResetFilter_20 () {
    {
      kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_20.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_20.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter localValue = new kz.greetgo.blog.server.beans.Utf8AndTraceResetFilter();
        cachedValue_native_Utf8AndTraceResetFilter_20.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.server.beans.WarEducationViews> cachedValue_native_WarEducationViews_21 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.server.beans.WarEducationViews> getter_native_WarEducationViews_21 = this::get_native_WarEducationViews_21;
  private kz.greetgo.blog.server.beans.WarEducationViews get_native_WarEducationViews_21 () {
    {
      kz.greetgo.blog.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_21.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_21.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.server.beans.WarEducationViews localValue = new kz.greetgo.blog.server.beans.WarEducationViews();
        cachedValue_native_WarEducationViews_21.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.controller.utils.Controller>> getter_ref_list_Controller_22 = this::get_ref_list_Controller_22;
  private java.util.List<kz.greetgo.blog.controller.utils.Controller> get_ref_list_Controller_22() {
    java.util.List<kz.greetgo.blog.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_HelloController_1.get());
    list.add(getter_native_LoginController_2.get());
    list.add(getter_native_PostsController_3.get());
    list.add(getter_native_TestController_4.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
