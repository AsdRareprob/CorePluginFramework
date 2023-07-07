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
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.local.IapBillingDao;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.local.IapBillingDao_Impl;
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

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `InAppPurchaseEntity` (`appId` TEXT NOT NULL, `productId` TEXT NOT NULL, `productType` TEXT NOT NULL, `productName` TEXT NOT NULL, `active` TEXT NOT NULL, `isPurchased` INTEGER NOT NULL, `sortSequence` INTEGER NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, `couponCode` TEXT NOT NULL, `couponProductId` TEXT NOT NULL, PRIMARY KEY(`appId`, `productId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '66d396ff1284c4c4e8b31fc3e0a5edc2')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `InAppPurchaseEntity`");
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
          return new RoomOpenHelper.ValidationResult(false, "InAppPurchaseEntity(com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.local.entity.InAppPurchaseEntity).\n"
                  + " Expected:\n" + _infoInAppPurchaseEntity + "\n"
                  + " Found:\n" + _existingInAppPurchaseEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "66d396ff1284c4c4e8b31fc3e0a5edc2", "c1ed70749a78e18724d28944a75e8d30");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "InAppPurchaseEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `InAppPurchaseEntity`");
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
}
