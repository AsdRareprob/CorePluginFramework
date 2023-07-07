package com.rareprob.core_pulgin.plugins.reward.data.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.rareprob.core_pulgin.plugins.reward.data.local.entity.RewardEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RewardDao_Impl implements RewardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RewardEntity> __insertionAdapterOfRewardEntity;

  private final EntityInsertionAdapter<RewardEntity> __insertionAdapterOfRewardEntity_1;

  private final EntityDeletionOrUpdateAdapter<RewardEntity> __deletionAdapterOfRewardEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RewardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRewardEntity = new EntityInsertionAdapter<RewardEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `RewardEntity` (`taskId`,`title`,`actionButtonCaption`,`ctaBgColor`,`rewardCoins`,`rewardIcon`,`taskIcon`,`taskIconBgColor`,`launchTargetScreenAction`,`sortSequence`,`durationOrFileCount`,`isRewardClaimed`,`rewardType`,`earnedCoins`,`taskCompletionStatus`,`taskDurationOrFileCount`,`taskAssignedDate`,`watchedDurationOrFilesOperatedCount`,`taskCompletionTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RewardEntity value) {
        stmt.bindLong(1, value.getTaskId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getActionButtonCaption() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getActionButtonCaption());
        }
        if (value.getCtaBgColor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCtaBgColor());
        }
        stmt.bindLong(5, value.getRewardCoins());
        if (value.getRewardIcon() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRewardIcon());
        }
        if (value.getTaskIcon() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTaskIcon());
        }
        if (value.getTaskIconBgColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTaskIconBgColor());
        }
        if (value.getLaunchTargetScreenAction() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLaunchTargetScreenAction());
        }
        stmt.bindLong(10, value.getSortSequence());
        stmt.bindLong(11, value.getDurationOrFileCount());
        final int _tmp;
        _tmp = value.isRewardClaimed() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getRewardType() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getRewardType());
        }
        stmt.bindLong(14, value.getEarnedCoins());
        final int _tmp_1;
        _tmp_1 = value.getTaskCompletionStatus() ? 1 : 0;
        stmt.bindLong(15, _tmp_1);
        stmt.bindLong(16, value.getTaskDurationOrFileCount());
        stmt.bindLong(17, value.getTaskAssignedDate());
        stmt.bindLong(18, value.getWatchedDurationOrFilesOperatedCount());
        stmt.bindLong(19, value.getTaskCompletionTime());
      }
    };
    this.__insertionAdapterOfRewardEntity_1 = new EntityInsertionAdapter<RewardEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RewardEntity` (`taskId`,`title`,`actionButtonCaption`,`ctaBgColor`,`rewardCoins`,`rewardIcon`,`taskIcon`,`taskIconBgColor`,`launchTargetScreenAction`,`sortSequence`,`durationOrFileCount`,`isRewardClaimed`,`rewardType`,`earnedCoins`,`taskCompletionStatus`,`taskDurationOrFileCount`,`taskAssignedDate`,`watchedDurationOrFilesOperatedCount`,`taskCompletionTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RewardEntity value) {
        stmt.bindLong(1, value.getTaskId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getActionButtonCaption() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getActionButtonCaption());
        }
        if (value.getCtaBgColor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCtaBgColor());
        }
        stmt.bindLong(5, value.getRewardCoins());
        if (value.getRewardIcon() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRewardIcon());
        }
        if (value.getTaskIcon() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTaskIcon());
        }
        if (value.getTaskIconBgColor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTaskIconBgColor());
        }
        if (value.getLaunchTargetScreenAction() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLaunchTargetScreenAction());
        }
        stmt.bindLong(10, value.getSortSequence());
        stmt.bindLong(11, value.getDurationOrFileCount());
        final int _tmp;
        _tmp = value.isRewardClaimed() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getRewardType() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getRewardType());
        }
        stmt.bindLong(14, value.getEarnedCoins());
        final int _tmp_1;
        _tmp_1 = value.getTaskCompletionStatus() ? 1 : 0;
        stmt.bindLong(15, _tmp_1);
        stmt.bindLong(16, value.getTaskDurationOrFileCount());
        stmt.bindLong(17, value.getTaskAssignedDate());
        stmt.bindLong(18, value.getWatchedDurationOrFilesOperatedCount());
        stmt.bindLong(19, value.getTaskCompletionTime());
      }
    };
    this.__deletionAdapterOfRewardEntity = new EntityDeletionOrUpdateAdapter<RewardEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `RewardEntity` WHERE `rewardType` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RewardEntity value) {
        if (value.getRewardType() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getRewardType());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RewardEntity";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<RewardEntity> rewards) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRewardEntity.insert(rewards);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdate(final RewardEntity rewards) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRewardEntity_1.insert(rewards);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final RewardEntity obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRewardEntity.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<RewardEntity> getRewards() {
    final String _sql = "SELECT * FROM RewardEntity ORDER BY sortSequence ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfActionButtonCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "actionButtonCaption");
      final int _cursorIndexOfCtaBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "ctaBgColor");
      final int _cursorIndexOfRewardCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardCoins");
      final int _cursorIndexOfRewardIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardIcon");
      final int _cursorIndexOfTaskIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIcon");
      final int _cursorIndexOfTaskIconBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIconBgColor");
      final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
      final int _cursorIndexOfSortSequence = CursorUtil.getColumnIndexOrThrow(_cursor, "sortSequence");
      final int _cursorIndexOfDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "durationOrFileCount");
      final int _cursorIndexOfIsRewardClaimed = CursorUtil.getColumnIndexOrThrow(_cursor, "isRewardClaimed");
      final int _cursorIndexOfRewardType = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardType");
      final int _cursorIndexOfEarnedCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "earnedCoins");
      final int _cursorIndexOfTaskCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionStatus");
      final int _cursorIndexOfTaskDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDurationOrFileCount");
      final int _cursorIndexOfTaskAssignedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "taskAssignedDate");
      final int _cursorIndexOfWatchedDurationOrFilesOperatedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "watchedDurationOrFilesOperatedCount");
      final int _cursorIndexOfTaskCompletionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionTime");
      final List<RewardEntity> _result = new ArrayList<RewardEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RewardEntity _item;
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpActionButtonCaption;
        if (_cursor.isNull(_cursorIndexOfActionButtonCaption)) {
          _tmpActionButtonCaption = null;
        } else {
          _tmpActionButtonCaption = _cursor.getString(_cursorIndexOfActionButtonCaption);
        }
        final String _tmpCtaBgColor;
        if (_cursor.isNull(_cursorIndexOfCtaBgColor)) {
          _tmpCtaBgColor = null;
        } else {
          _tmpCtaBgColor = _cursor.getString(_cursorIndexOfCtaBgColor);
        }
        final long _tmpRewardCoins;
        _tmpRewardCoins = _cursor.getLong(_cursorIndexOfRewardCoins);
        final String _tmpRewardIcon;
        if (_cursor.isNull(_cursorIndexOfRewardIcon)) {
          _tmpRewardIcon = null;
        } else {
          _tmpRewardIcon = _cursor.getString(_cursorIndexOfRewardIcon);
        }
        final String _tmpTaskIcon;
        if (_cursor.isNull(_cursorIndexOfTaskIcon)) {
          _tmpTaskIcon = null;
        } else {
          _tmpTaskIcon = _cursor.getString(_cursorIndexOfTaskIcon);
        }
        final String _tmpTaskIconBgColor;
        if (_cursor.isNull(_cursorIndexOfTaskIconBgColor)) {
          _tmpTaskIconBgColor = null;
        } else {
          _tmpTaskIconBgColor = _cursor.getString(_cursorIndexOfTaskIconBgColor);
        }
        final String _tmpLaunchTargetScreenAction;
        if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
          _tmpLaunchTargetScreenAction = null;
        } else {
          _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
        }
        final int _tmpSortSequence;
        _tmpSortSequence = _cursor.getInt(_cursorIndexOfSortSequence);
        final long _tmpDurationOrFileCount;
        _tmpDurationOrFileCount = _cursor.getLong(_cursorIndexOfDurationOrFileCount);
        final boolean _tmpIsRewardClaimed;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsRewardClaimed);
        _tmpIsRewardClaimed = _tmp != 0;
        final String _tmpRewardType;
        if (_cursor.isNull(_cursorIndexOfRewardType)) {
          _tmpRewardType = null;
        } else {
          _tmpRewardType = _cursor.getString(_cursorIndexOfRewardType);
        }
        final long _tmpEarnedCoins;
        _tmpEarnedCoins = _cursor.getLong(_cursorIndexOfEarnedCoins);
        final boolean _tmpTaskCompletionStatus;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfTaskCompletionStatus);
        _tmpTaskCompletionStatus = _tmp_1 != 0;
        final long _tmpTaskDurationOrFileCount;
        _tmpTaskDurationOrFileCount = _cursor.getLong(_cursorIndexOfTaskDurationOrFileCount);
        final long _tmpTaskAssignedDate;
        _tmpTaskAssignedDate = _cursor.getLong(_cursorIndexOfTaskAssignedDate);
        final long _tmpWatchedDurationOrFilesOperatedCount;
        _tmpWatchedDurationOrFilesOperatedCount = _cursor.getLong(_cursorIndexOfWatchedDurationOrFilesOperatedCount);
        final long _tmpTaskCompletionTime;
        _tmpTaskCompletionTime = _cursor.getLong(_cursorIndexOfTaskCompletionTime);
        _item = new RewardEntity(_tmpTaskId,_tmpTitle,_tmpActionButtonCaption,_tmpCtaBgColor,_tmpRewardCoins,_tmpRewardIcon,_tmpTaskIcon,_tmpTaskIconBgColor,_tmpLaunchTargetScreenAction,_tmpSortSequence,_tmpDurationOrFileCount,_tmpIsRewardClaimed,_tmpRewardType,_tmpEarnedCoins,_tmpTaskCompletionStatus,_tmpTaskDurationOrFileCount,_tmpTaskAssignedDate,_tmpWatchedDurationOrFilesOperatedCount,_tmpTaskCompletionTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RewardEntity> getSortedRewardTasks() {
    final String _sql = "SELECT * FROM RewardEntity ORDER BY taskCompletionTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfActionButtonCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "actionButtonCaption");
      final int _cursorIndexOfCtaBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "ctaBgColor");
      final int _cursorIndexOfRewardCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardCoins");
      final int _cursorIndexOfRewardIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardIcon");
      final int _cursorIndexOfTaskIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIcon");
      final int _cursorIndexOfTaskIconBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIconBgColor");
      final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
      final int _cursorIndexOfSortSequence = CursorUtil.getColumnIndexOrThrow(_cursor, "sortSequence");
      final int _cursorIndexOfDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "durationOrFileCount");
      final int _cursorIndexOfIsRewardClaimed = CursorUtil.getColumnIndexOrThrow(_cursor, "isRewardClaimed");
      final int _cursorIndexOfRewardType = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardType");
      final int _cursorIndexOfEarnedCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "earnedCoins");
      final int _cursorIndexOfTaskCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionStatus");
      final int _cursorIndexOfTaskDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDurationOrFileCount");
      final int _cursorIndexOfTaskAssignedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "taskAssignedDate");
      final int _cursorIndexOfWatchedDurationOrFilesOperatedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "watchedDurationOrFilesOperatedCount");
      final int _cursorIndexOfTaskCompletionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionTime");
      final List<RewardEntity> _result = new ArrayList<RewardEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RewardEntity _item;
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpActionButtonCaption;
        if (_cursor.isNull(_cursorIndexOfActionButtonCaption)) {
          _tmpActionButtonCaption = null;
        } else {
          _tmpActionButtonCaption = _cursor.getString(_cursorIndexOfActionButtonCaption);
        }
        final String _tmpCtaBgColor;
        if (_cursor.isNull(_cursorIndexOfCtaBgColor)) {
          _tmpCtaBgColor = null;
        } else {
          _tmpCtaBgColor = _cursor.getString(_cursorIndexOfCtaBgColor);
        }
        final long _tmpRewardCoins;
        _tmpRewardCoins = _cursor.getLong(_cursorIndexOfRewardCoins);
        final String _tmpRewardIcon;
        if (_cursor.isNull(_cursorIndexOfRewardIcon)) {
          _tmpRewardIcon = null;
        } else {
          _tmpRewardIcon = _cursor.getString(_cursorIndexOfRewardIcon);
        }
        final String _tmpTaskIcon;
        if (_cursor.isNull(_cursorIndexOfTaskIcon)) {
          _tmpTaskIcon = null;
        } else {
          _tmpTaskIcon = _cursor.getString(_cursorIndexOfTaskIcon);
        }
        final String _tmpTaskIconBgColor;
        if (_cursor.isNull(_cursorIndexOfTaskIconBgColor)) {
          _tmpTaskIconBgColor = null;
        } else {
          _tmpTaskIconBgColor = _cursor.getString(_cursorIndexOfTaskIconBgColor);
        }
        final String _tmpLaunchTargetScreenAction;
        if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
          _tmpLaunchTargetScreenAction = null;
        } else {
          _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
        }
        final int _tmpSortSequence;
        _tmpSortSequence = _cursor.getInt(_cursorIndexOfSortSequence);
        final long _tmpDurationOrFileCount;
        _tmpDurationOrFileCount = _cursor.getLong(_cursorIndexOfDurationOrFileCount);
        final boolean _tmpIsRewardClaimed;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsRewardClaimed);
        _tmpIsRewardClaimed = _tmp != 0;
        final String _tmpRewardType;
        if (_cursor.isNull(_cursorIndexOfRewardType)) {
          _tmpRewardType = null;
        } else {
          _tmpRewardType = _cursor.getString(_cursorIndexOfRewardType);
        }
        final long _tmpEarnedCoins;
        _tmpEarnedCoins = _cursor.getLong(_cursorIndexOfEarnedCoins);
        final boolean _tmpTaskCompletionStatus;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfTaskCompletionStatus);
        _tmpTaskCompletionStatus = _tmp_1 != 0;
        final long _tmpTaskDurationOrFileCount;
        _tmpTaskDurationOrFileCount = _cursor.getLong(_cursorIndexOfTaskDurationOrFileCount);
        final long _tmpTaskAssignedDate;
        _tmpTaskAssignedDate = _cursor.getLong(_cursorIndexOfTaskAssignedDate);
        final long _tmpWatchedDurationOrFilesOperatedCount;
        _tmpWatchedDurationOrFilesOperatedCount = _cursor.getLong(_cursorIndexOfWatchedDurationOrFilesOperatedCount);
        final long _tmpTaskCompletionTime;
        _tmpTaskCompletionTime = _cursor.getLong(_cursorIndexOfTaskCompletionTime);
        _item = new RewardEntity(_tmpTaskId,_tmpTitle,_tmpActionButtonCaption,_tmpCtaBgColor,_tmpRewardCoins,_tmpRewardIcon,_tmpTaskIcon,_tmpTaskIconBgColor,_tmpLaunchTargetScreenAction,_tmpSortSequence,_tmpDurationOrFileCount,_tmpIsRewardClaimed,_tmpRewardType,_tmpEarnedCoins,_tmpTaskCompletionStatus,_tmpTaskDurationOrFileCount,_tmpTaskAssignedDate,_tmpWatchedDurationOrFilesOperatedCount,_tmpTaskCompletionTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public RewardEntity getReward(final String rewardType) {
    final String _sql = "SELECT * FROM RewardEntity where rewardType = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (rewardType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, rewardType);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfActionButtonCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "actionButtonCaption");
      final int _cursorIndexOfCtaBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "ctaBgColor");
      final int _cursorIndexOfRewardCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardCoins");
      final int _cursorIndexOfRewardIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardIcon");
      final int _cursorIndexOfTaskIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIcon");
      final int _cursorIndexOfTaskIconBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIconBgColor");
      final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
      final int _cursorIndexOfSortSequence = CursorUtil.getColumnIndexOrThrow(_cursor, "sortSequence");
      final int _cursorIndexOfDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "durationOrFileCount");
      final int _cursorIndexOfIsRewardClaimed = CursorUtil.getColumnIndexOrThrow(_cursor, "isRewardClaimed");
      final int _cursorIndexOfRewardType = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardType");
      final int _cursorIndexOfEarnedCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "earnedCoins");
      final int _cursorIndexOfTaskCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionStatus");
      final int _cursorIndexOfTaskDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDurationOrFileCount");
      final int _cursorIndexOfTaskAssignedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "taskAssignedDate");
      final int _cursorIndexOfWatchedDurationOrFilesOperatedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "watchedDurationOrFilesOperatedCount");
      final int _cursorIndexOfTaskCompletionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionTime");
      final RewardEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpActionButtonCaption;
        if (_cursor.isNull(_cursorIndexOfActionButtonCaption)) {
          _tmpActionButtonCaption = null;
        } else {
          _tmpActionButtonCaption = _cursor.getString(_cursorIndexOfActionButtonCaption);
        }
        final String _tmpCtaBgColor;
        if (_cursor.isNull(_cursorIndexOfCtaBgColor)) {
          _tmpCtaBgColor = null;
        } else {
          _tmpCtaBgColor = _cursor.getString(_cursorIndexOfCtaBgColor);
        }
        final long _tmpRewardCoins;
        _tmpRewardCoins = _cursor.getLong(_cursorIndexOfRewardCoins);
        final String _tmpRewardIcon;
        if (_cursor.isNull(_cursorIndexOfRewardIcon)) {
          _tmpRewardIcon = null;
        } else {
          _tmpRewardIcon = _cursor.getString(_cursorIndexOfRewardIcon);
        }
        final String _tmpTaskIcon;
        if (_cursor.isNull(_cursorIndexOfTaskIcon)) {
          _tmpTaskIcon = null;
        } else {
          _tmpTaskIcon = _cursor.getString(_cursorIndexOfTaskIcon);
        }
        final String _tmpTaskIconBgColor;
        if (_cursor.isNull(_cursorIndexOfTaskIconBgColor)) {
          _tmpTaskIconBgColor = null;
        } else {
          _tmpTaskIconBgColor = _cursor.getString(_cursorIndexOfTaskIconBgColor);
        }
        final String _tmpLaunchTargetScreenAction;
        if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
          _tmpLaunchTargetScreenAction = null;
        } else {
          _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
        }
        final int _tmpSortSequence;
        _tmpSortSequence = _cursor.getInt(_cursorIndexOfSortSequence);
        final long _tmpDurationOrFileCount;
        _tmpDurationOrFileCount = _cursor.getLong(_cursorIndexOfDurationOrFileCount);
        final boolean _tmpIsRewardClaimed;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsRewardClaimed);
        _tmpIsRewardClaimed = _tmp != 0;
        final String _tmpRewardType;
        if (_cursor.isNull(_cursorIndexOfRewardType)) {
          _tmpRewardType = null;
        } else {
          _tmpRewardType = _cursor.getString(_cursorIndexOfRewardType);
        }
        final long _tmpEarnedCoins;
        _tmpEarnedCoins = _cursor.getLong(_cursorIndexOfEarnedCoins);
        final boolean _tmpTaskCompletionStatus;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfTaskCompletionStatus);
        _tmpTaskCompletionStatus = _tmp_1 != 0;
        final long _tmpTaskDurationOrFileCount;
        _tmpTaskDurationOrFileCount = _cursor.getLong(_cursorIndexOfTaskDurationOrFileCount);
        final long _tmpTaskAssignedDate;
        _tmpTaskAssignedDate = _cursor.getLong(_cursorIndexOfTaskAssignedDate);
        final long _tmpWatchedDurationOrFilesOperatedCount;
        _tmpWatchedDurationOrFilesOperatedCount = _cursor.getLong(_cursorIndexOfWatchedDurationOrFilesOperatedCount);
        final long _tmpTaskCompletionTime;
        _tmpTaskCompletionTime = _cursor.getLong(_cursorIndexOfTaskCompletionTime);
        _result = new RewardEntity(_tmpTaskId,_tmpTitle,_tmpActionButtonCaption,_tmpCtaBgColor,_tmpRewardCoins,_tmpRewardIcon,_tmpTaskIcon,_tmpTaskIconBgColor,_tmpLaunchTargetScreenAction,_tmpSortSequence,_tmpDurationOrFileCount,_tmpIsRewardClaimed,_tmpRewardType,_tmpEarnedCoins,_tmpTaskCompletionStatus,_tmpTaskDurationOrFileCount,_tmpTaskAssignedDate,_tmpWatchedDurationOrFilesOperatedCount,_tmpTaskCompletionTime);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RewardEntity> getCompletedRewardTask(final boolean taskCompletionStatus) {
    final String _sql = "SELECT * FROM RewardEntity where taskCompletionStatus = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = taskCompletionStatus ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfActionButtonCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "actionButtonCaption");
      final int _cursorIndexOfCtaBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "ctaBgColor");
      final int _cursorIndexOfRewardCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardCoins");
      final int _cursorIndexOfRewardIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardIcon");
      final int _cursorIndexOfTaskIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIcon");
      final int _cursorIndexOfTaskIconBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIconBgColor");
      final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
      final int _cursorIndexOfSortSequence = CursorUtil.getColumnIndexOrThrow(_cursor, "sortSequence");
      final int _cursorIndexOfDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "durationOrFileCount");
      final int _cursorIndexOfIsRewardClaimed = CursorUtil.getColumnIndexOrThrow(_cursor, "isRewardClaimed");
      final int _cursorIndexOfRewardType = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardType");
      final int _cursorIndexOfEarnedCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "earnedCoins");
      final int _cursorIndexOfTaskCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionStatus");
      final int _cursorIndexOfTaskDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDurationOrFileCount");
      final int _cursorIndexOfTaskAssignedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "taskAssignedDate");
      final int _cursorIndexOfWatchedDurationOrFilesOperatedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "watchedDurationOrFilesOperatedCount");
      final int _cursorIndexOfTaskCompletionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionTime");
      final List<RewardEntity> _result = new ArrayList<RewardEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RewardEntity _item;
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpActionButtonCaption;
        if (_cursor.isNull(_cursorIndexOfActionButtonCaption)) {
          _tmpActionButtonCaption = null;
        } else {
          _tmpActionButtonCaption = _cursor.getString(_cursorIndexOfActionButtonCaption);
        }
        final String _tmpCtaBgColor;
        if (_cursor.isNull(_cursorIndexOfCtaBgColor)) {
          _tmpCtaBgColor = null;
        } else {
          _tmpCtaBgColor = _cursor.getString(_cursorIndexOfCtaBgColor);
        }
        final long _tmpRewardCoins;
        _tmpRewardCoins = _cursor.getLong(_cursorIndexOfRewardCoins);
        final String _tmpRewardIcon;
        if (_cursor.isNull(_cursorIndexOfRewardIcon)) {
          _tmpRewardIcon = null;
        } else {
          _tmpRewardIcon = _cursor.getString(_cursorIndexOfRewardIcon);
        }
        final String _tmpTaskIcon;
        if (_cursor.isNull(_cursorIndexOfTaskIcon)) {
          _tmpTaskIcon = null;
        } else {
          _tmpTaskIcon = _cursor.getString(_cursorIndexOfTaskIcon);
        }
        final String _tmpTaskIconBgColor;
        if (_cursor.isNull(_cursorIndexOfTaskIconBgColor)) {
          _tmpTaskIconBgColor = null;
        } else {
          _tmpTaskIconBgColor = _cursor.getString(_cursorIndexOfTaskIconBgColor);
        }
        final String _tmpLaunchTargetScreenAction;
        if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
          _tmpLaunchTargetScreenAction = null;
        } else {
          _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
        }
        final int _tmpSortSequence;
        _tmpSortSequence = _cursor.getInt(_cursorIndexOfSortSequence);
        final long _tmpDurationOrFileCount;
        _tmpDurationOrFileCount = _cursor.getLong(_cursorIndexOfDurationOrFileCount);
        final boolean _tmpIsRewardClaimed;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsRewardClaimed);
        _tmpIsRewardClaimed = _tmp_1 != 0;
        final String _tmpRewardType;
        if (_cursor.isNull(_cursorIndexOfRewardType)) {
          _tmpRewardType = null;
        } else {
          _tmpRewardType = _cursor.getString(_cursorIndexOfRewardType);
        }
        final long _tmpEarnedCoins;
        _tmpEarnedCoins = _cursor.getLong(_cursorIndexOfEarnedCoins);
        final boolean _tmpTaskCompletionStatus;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfTaskCompletionStatus);
        _tmpTaskCompletionStatus = _tmp_2 != 0;
        final long _tmpTaskDurationOrFileCount;
        _tmpTaskDurationOrFileCount = _cursor.getLong(_cursorIndexOfTaskDurationOrFileCount);
        final long _tmpTaskAssignedDate;
        _tmpTaskAssignedDate = _cursor.getLong(_cursorIndexOfTaskAssignedDate);
        final long _tmpWatchedDurationOrFilesOperatedCount;
        _tmpWatchedDurationOrFilesOperatedCount = _cursor.getLong(_cursorIndexOfWatchedDurationOrFilesOperatedCount);
        final long _tmpTaskCompletionTime;
        _tmpTaskCompletionTime = _cursor.getLong(_cursorIndexOfTaskCompletionTime);
        _item = new RewardEntity(_tmpTaskId,_tmpTitle,_tmpActionButtonCaption,_tmpCtaBgColor,_tmpRewardCoins,_tmpRewardIcon,_tmpTaskIcon,_tmpTaskIconBgColor,_tmpLaunchTargetScreenAction,_tmpSortSequence,_tmpDurationOrFileCount,_tmpIsRewardClaimed,_tmpRewardType,_tmpEarnedCoins,_tmpTaskCompletionStatus,_tmpTaskDurationOrFileCount,_tmpTaskAssignedDate,_tmpWatchedDurationOrFilesOperatedCount,_tmpTaskCompletionTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RewardEntity> getSortedRewardTaskByCompletionStatus() {
    final String _sql = "SELECT * FROM RewardEntity ORDER BY taskCompletionStatus DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfActionButtonCaption = CursorUtil.getColumnIndexOrThrow(_cursor, "actionButtonCaption");
      final int _cursorIndexOfCtaBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "ctaBgColor");
      final int _cursorIndexOfRewardCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardCoins");
      final int _cursorIndexOfRewardIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardIcon");
      final int _cursorIndexOfTaskIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIcon");
      final int _cursorIndexOfTaskIconBgColor = CursorUtil.getColumnIndexOrThrow(_cursor, "taskIconBgColor");
      final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
      final int _cursorIndexOfSortSequence = CursorUtil.getColumnIndexOrThrow(_cursor, "sortSequence");
      final int _cursorIndexOfDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "durationOrFileCount");
      final int _cursorIndexOfIsRewardClaimed = CursorUtil.getColumnIndexOrThrow(_cursor, "isRewardClaimed");
      final int _cursorIndexOfRewardType = CursorUtil.getColumnIndexOrThrow(_cursor, "rewardType");
      final int _cursorIndexOfEarnedCoins = CursorUtil.getColumnIndexOrThrow(_cursor, "earnedCoins");
      final int _cursorIndexOfTaskCompletionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionStatus");
      final int _cursorIndexOfTaskDurationOrFileCount = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDurationOrFileCount");
      final int _cursorIndexOfTaskAssignedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "taskAssignedDate");
      final int _cursorIndexOfWatchedDurationOrFilesOperatedCount = CursorUtil.getColumnIndexOrThrow(_cursor, "watchedDurationOrFilesOperatedCount");
      final int _cursorIndexOfTaskCompletionTime = CursorUtil.getColumnIndexOrThrow(_cursor, "taskCompletionTime");
      final List<RewardEntity> _result = new ArrayList<RewardEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RewardEntity _item;
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpActionButtonCaption;
        if (_cursor.isNull(_cursorIndexOfActionButtonCaption)) {
          _tmpActionButtonCaption = null;
        } else {
          _tmpActionButtonCaption = _cursor.getString(_cursorIndexOfActionButtonCaption);
        }
        final String _tmpCtaBgColor;
        if (_cursor.isNull(_cursorIndexOfCtaBgColor)) {
          _tmpCtaBgColor = null;
        } else {
          _tmpCtaBgColor = _cursor.getString(_cursorIndexOfCtaBgColor);
        }
        final long _tmpRewardCoins;
        _tmpRewardCoins = _cursor.getLong(_cursorIndexOfRewardCoins);
        final String _tmpRewardIcon;
        if (_cursor.isNull(_cursorIndexOfRewardIcon)) {
          _tmpRewardIcon = null;
        } else {
          _tmpRewardIcon = _cursor.getString(_cursorIndexOfRewardIcon);
        }
        final String _tmpTaskIcon;
        if (_cursor.isNull(_cursorIndexOfTaskIcon)) {
          _tmpTaskIcon = null;
        } else {
          _tmpTaskIcon = _cursor.getString(_cursorIndexOfTaskIcon);
        }
        final String _tmpTaskIconBgColor;
        if (_cursor.isNull(_cursorIndexOfTaskIconBgColor)) {
          _tmpTaskIconBgColor = null;
        } else {
          _tmpTaskIconBgColor = _cursor.getString(_cursorIndexOfTaskIconBgColor);
        }
        final String _tmpLaunchTargetScreenAction;
        if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
          _tmpLaunchTargetScreenAction = null;
        } else {
          _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
        }
        final int _tmpSortSequence;
        _tmpSortSequence = _cursor.getInt(_cursorIndexOfSortSequence);
        final long _tmpDurationOrFileCount;
        _tmpDurationOrFileCount = _cursor.getLong(_cursorIndexOfDurationOrFileCount);
        final boolean _tmpIsRewardClaimed;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsRewardClaimed);
        _tmpIsRewardClaimed = _tmp != 0;
        final String _tmpRewardType;
        if (_cursor.isNull(_cursorIndexOfRewardType)) {
          _tmpRewardType = null;
        } else {
          _tmpRewardType = _cursor.getString(_cursorIndexOfRewardType);
        }
        final long _tmpEarnedCoins;
        _tmpEarnedCoins = _cursor.getLong(_cursorIndexOfEarnedCoins);
        final boolean _tmpTaskCompletionStatus;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfTaskCompletionStatus);
        _tmpTaskCompletionStatus = _tmp_1 != 0;
        final long _tmpTaskDurationOrFileCount;
        _tmpTaskDurationOrFileCount = _cursor.getLong(_cursorIndexOfTaskDurationOrFileCount);
        final long _tmpTaskAssignedDate;
        _tmpTaskAssignedDate = _cursor.getLong(_cursorIndexOfTaskAssignedDate);
        final long _tmpWatchedDurationOrFilesOperatedCount;
        _tmpWatchedDurationOrFilesOperatedCount = _cursor.getLong(_cursorIndexOfWatchedDurationOrFilesOperatedCount);
        final long _tmpTaskCompletionTime;
        _tmpTaskCompletionTime = _cursor.getLong(_cursorIndexOfTaskCompletionTime);
        _item = new RewardEntity(_tmpTaskId,_tmpTitle,_tmpActionButtonCaption,_tmpCtaBgColor,_tmpRewardCoins,_tmpRewardIcon,_tmpTaskIcon,_tmpTaskIconBgColor,_tmpLaunchTargetScreenAction,_tmpSortSequence,_tmpDurationOrFileCount,_tmpIsRewardClaimed,_tmpRewardType,_tmpEarnedCoins,_tmpTaskCompletionStatus,_tmpTaskDurationOrFileCount,_tmpTaskAssignedDate,_tmpWatchedDurationOrFilesOperatedCount,_tmpTaskCompletionTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
