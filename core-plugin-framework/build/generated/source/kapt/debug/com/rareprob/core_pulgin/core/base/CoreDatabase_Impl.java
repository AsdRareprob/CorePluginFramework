package com.rareprob.core_pulgin.core.base;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.rareprob.core_pulgin.core.notification.data.local.entity.NotificationDao;
import com.rareprob.core_pulgin.core.notification.data.local.entity.NotificationDao_Impl;
import com.rareprob.core_pulgin.payment.in_app_purchase.data.local.IapBillingDao;
import com.rareprob.core_pulgin.payment.in_app_purchase.data.local.IapBillingDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoreDatabase_Impl extends CoreDatabase {
  private volatile IapBillingDao _iapBillingDao;

  private volatile NotificationDao _notificationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InAppPurchaseEntity` (`appId` TEXT NOT NULL, `productId` TEXT NOT NULL, `productType` TEXT NOT NULL, `productName` TEXT NOT NULL, `active` TEXT NOT NULL, `isPurchased` INTEGER NOT NULL, `sortSequence` INTEGER NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, `couponCode` TEXT NOT NULL, `couponProductId` TEXT NOT NULL, PRIMARY KEY(`appId`, `productId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PushNotificationEntity` (`messageId` TEXT NOT NULL, `time` INTEGER NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `big_image` TEXT NOT NULL, `landing_type` TEXT NOT NULL, `landing_value` TEXT NOT NULL, `app_version` TEXT NOT NULL, `toolbar_title` TEXT NOT NULL, `large_icon_url` TEXT NOT NULL, `gradientColors` TEXT NOT NULL, `launchTargetScreenAction` TEXT NOT NULL, `CTACaption1` TEXT NOT NULL, `CTALaunchScreen1` TEXT NOT NULL, `CTACaption2` TEXT NOT NULL, `CTALaunchScreen2` TEXT NOT NULL, `CTACaption3` TEXT NOT NULL, `CTALaunchScreen3` TEXT NOT NULL, PRIMARY KEY(`messageId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9d952766a7fd17847190cb4c0ab612e4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `InAppPurchaseEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `PushNotificationEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsInAppPurchaseEntity = new HashMap<String, TableInfo.Column>(11);
        _columnsInAppPurchaseEntity.put("appId", new TableInfo.Column("appId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("productId", new TableInfo.Column("productId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("productType", new TableInfo.Column("productType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("productName", new TableInfo.Column("productName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("active", new TableInfo.Column("active", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("isPurchased", new TableInfo.Column("isPurchased", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("sortSequence", new TableInfo.Column("sortSequence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("startDate", new TableInfo.Column("startDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("endDate", new TableInfo.Column("endDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("couponCode", new TableInfo.Column("couponCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInAppPurchaseEntity.put("couponProductId", new TableInfo.Column("couponProductId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInAppPurchaseEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesInAppPurchaseEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInAppPurchaseEntity = new TableInfo("InAppPurchaseEntity", _columnsInAppPurchaseEntity, _foreignKeysInAppPurchaseEntity, _indicesInAppPurchaseEntity);
        final TableInfo _existingInAppPurchaseEntity = TableInfo.read(_db, "InAppPurchaseEntity");
        if (! _infoInAppPurchaseEntity.equals(_existingInAppPurchaseEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "InAppPurchaseEntity(com.rareprob.core_pulgin.payment.in_app_purchase.data.local.entity.InAppPurchaseEntity).\n"
                  + " Expected:\n" + _infoInAppPurchaseEntity + "\n"
                  + " Found:\n" + _existingInAppPurchaseEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsPushNotificationEntity = new HashMap<String, TableInfo.Column>(18);
        _columnsPushNotificationEntity.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("big_image", new TableInfo.Column("big_image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("landing_type", new TableInfo.Column("landing_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("landing_value", new TableInfo.Column("landing_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("app_version", new TableInfo.Column("app_version", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("toolbar_title", new TableInfo.Column("toolbar_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("large_icon_url", new TableInfo.Column("large_icon_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("gradientColors", new TableInfo.Column("gradientColors", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("launchTargetScreenAction", new TableInfo.Column("launchTargetScreenAction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTACaption1", new TableInfo.Column("CTACaption1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTALaunchScreen1", new TableInfo.Column("CTALaunchScreen1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTACaption2", new TableInfo.Column("CTACaption2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTALaunchScreen2", new TableInfo.Column("CTALaunchScreen2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTACaption3", new TableInfo.Column("CTACaption3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushNotificationEntity.put("CTALaunchScreen3", new TableInfo.Column("CTALaunchScreen3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPushNotificationEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPushNotificationEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPushNotificationEntity = new TableInfo("PushNotificationEntity", _columnsPushNotificationEntity, _foreignKeysPushNotificationEntity, _indicesPushNotificationEntity);
        final TableInfo _existingPushNotificationEntity = TableInfo.read(_db, "PushNotificationEntity");
        if (! _infoPushNotificationEntity.equals(_existingPushNotificationEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PushNotificationEntity(com.rareprob.core_pulgin.core.notification.data.local.entity.PushNotificationEntity).\n"
                  + " Expected:\n" + _infoPushNotificationEntity + "\n"
                  + " Found:\n" + _existingPushNotificationEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9d952766a7fd17847190cb4c0ab612e4", "b6f47ddad4ad99eb67b6763b7ed6289c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "InAppPurchaseEntity","PushNotificationEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `InAppPurchaseEntity`");
      _db.execSQL("DELETE FROM `PushNotificationEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(IapBillingDao.class, IapBillingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NotificationDao.class, NotificationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public IapBillingDao getInAppPurchaseDao() {
    if (_iapBillingDao != null) {
      return _iapBillingDao;
    } else {
      synchronized(this) {
        if(_iapBillingDao == null) {
          _iapBillingDao = new IapBillingDao_Impl(this);
        }
        return _iapBillingDao;
      }
    }
  }

  @Override
  public NotificationDao getNotificationDao() {
    if (_notificationDao != null) {
      return _notificationDao;
    } else {
      synchronized(this) {
        if(_notificationDao == null) {
          _notificationDao = new NotificationDao_Impl(this);
        }
        return _notificationDao;
      }
    }
  }
}
