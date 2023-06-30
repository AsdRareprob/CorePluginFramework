package com.rareprob.core_pulgin.plugins.reward.data.local;

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
public final class RewardRoomDatabase_Impl extends RewardRoomDatabase {
  private volatile RewardDao _rewardDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RewardEntity` (`taskId` INTEGER NOT NULL, `title` TEXT NOT NULL, `actionButtonCaption` TEXT NOT NULL, `ctaBgColor` TEXT NOT NULL, `rewardCoins` INTEGER NOT NULL, `rewardIcon` TEXT NOT NULL, `taskIcon` TEXT NOT NULL, `taskIconBgColor` TEXT NOT NULL, `launchTargetScreenAction` TEXT NOT NULL, `sortSequence` INTEGER NOT NULL, `durationOrFileCount` INTEGER NOT NULL, `isRewardClaimed` INTEGER NOT NULL, `rewardType` TEXT NOT NULL, `earnedCoins` INTEGER NOT NULL, `taskCompletionStatus` INTEGER NOT NULL, `taskDurationOrFileCount` INTEGER NOT NULL, `taskAssignedDate` INTEGER NOT NULL, `watchedDurationOrFilesOperatedCount` INTEGER NOT NULL, `taskCompletionTime` INTEGER NOT NULL, PRIMARY KEY(`rewardType`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0b9064e3c8a8da58cfbd17db5eb611dd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `RewardEntity`");
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
        final HashMap<String, TableInfo.Column> _columnsRewardEntity = new HashMap<String, TableInfo.Column>(19);
        _columnsRewardEntity.put("taskId", new TableInfo.Column("taskId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("actionButtonCaption", new TableInfo.Column("actionButtonCaption", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("ctaBgColor", new TableInfo.Column("ctaBgColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("rewardCoins", new TableInfo.Column("rewardCoins", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("rewardIcon", new TableInfo.Column("rewardIcon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskIcon", new TableInfo.Column("taskIcon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskIconBgColor", new TableInfo.Column("taskIconBgColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("launchTargetScreenAction", new TableInfo.Column("launchTargetScreenAction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("sortSequence", new TableInfo.Column("sortSequence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("durationOrFileCount", new TableInfo.Column("durationOrFileCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("isRewardClaimed", new TableInfo.Column("isRewardClaimed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("rewardType", new TableInfo.Column("rewardType", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("earnedCoins", new TableInfo.Column("earnedCoins", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskCompletionStatus", new TableInfo.Column("taskCompletionStatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskDurationOrFileCount", new TableInfo.Column("taskDurationOrFileCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskAssignedDate", new TableInfo.Column("taskAssignedDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("watchedDurationOrFilesOperatedCount", new TableInfo.Column("watchedDurationOrFilesOperatedCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRewardEntity.put("taskCompletionTime", new TableInfo.Column("taskCompletionTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRewardEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRewardEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRewardEntity = new TableInfo("RewardEntity", _columnsRewardEntity, _foreignKeysRewardEntity, _indicesRewardEntity);
        final TableInfo _existingRewardEntity = TableInfo.read(_db, "RewardEntity");
        if (! _infoRewardEntity.equals(_existingRewardEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "RewardEntity(com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity).\n"
                  + " Expected:\n" + _infoRewardEntity + "\n"
                  + " Found:\n" + _existingRewardEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0b9064e3c8a8da58cfbd17db5eb611dd", "5bbbfbb6c774d7aad3443a0aa3634a26");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "RewardEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `RewardEntity`");
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
    _typeConvertersMap.put(RewardDao.class, RewardDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public RewardDao rewardDao() {
    if (_rewardDao != null) {
      return _rewardDao;
    } else {
      synchronized(this) {
        if(_rewardDao == null) {
          _rewardDao = new RewardDao_Impl(this);
        }
        return _rewardDao;
      }
    }
  }
}
