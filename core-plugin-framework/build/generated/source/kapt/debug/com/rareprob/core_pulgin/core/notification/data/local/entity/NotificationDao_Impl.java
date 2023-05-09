package com.rareprob.core_pulgin.core.notification.data.local.entity;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotificationDao_Impl implements NotificationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PushNotificationEntity> __insertionAdapterOfPushNotificationEntity;

  private final EntityDeletionOrUpdateAdapter<PushNotificationEntity> __deletionAdapterOfPushNotificationEntity;

  private final EntityDeletionOrUpdateAdapter<PushNotificationEntity> __updateAdapterOfPushNotificationEntity;

  public NotificationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPushNotificationEntity = new EntityInsertionAdapter<PushNotificationEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PushNotificationEntity` (`messageId`,`time`,`title`,`body`,`big_image`,`landing_type`,`landing_value`,`app_version`,`toolbar_title`,`large_icon_url`,`gradientColors`,`launchTargetScreenAction`,`CTACaption1`,`CTALaunchScreen1`,`CTACaption2`,`CTALaunchScreen2`,`CTACaption3`,`CTALaunchScreen3`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PushNotificationEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
        stmt.bindLong(2, value.getTime());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
        if (value.getBig_image() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBig_image());
        }
        if (value.getLanding_type() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLanding_type());
        }
        if (value.getLanding_value() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanding_value());
        }
        if (value.getApp_version() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getApp_version());
        }
        if (value.getToolbar_title() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getToolbar_title());
        }
        if (value.getLarge_icon_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLarge_icon_url());
        }
        if (value.getGradientColors() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGradientColors());
        }
        if (value.getLaunchTargetScreenAction() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getLaunchTargetScreenAction());
        }
        if (value.getCTACaption1() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCTACaption1());
        }
        if (value.getCTALaunchScreen1() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCTALaunchScreen1());
        }
        if (value.getCTACaption2() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getCTACaption2());
        }
        if (value.getCTALaunchScreen2() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getCTALaunchScreen2());
        }
        if (value.getCTACaption3() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCTACaption3());
        }
        if (value.getCTALaunchScreen3() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getCTALaunchScreen3());
        }
      }
    };
    this.__deletionAdapterOfPushNotificationEntity = new EntityDeletionOrUpdateAdapter<PushNotificationEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PushNotificationEntity` WHERE `messageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PushNotificationEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
      }
    };
    this.__updateAdapterOfPushNotificationEntity = new EntityDeletionOrUpdateAdapter<PushNotificationEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PushNotificationEntity` SET `messageId` = ?,`time` = ?,`title` = ?,`body` = ?,`big_image` = ?,`landing_type` = ?,`landing_value` = ?,`app_version` = ?,`toolbar_title` = ?,`large_icon_url` = ?,`gradientColors` = ?,`launchTargetScreenAction` = ?,`CTACaption1` = ?,`CTALaunchScreen1` = ?,`CTACaption2` = ?,`CTALaunchScreen2` = ?,`CTACaption3` = ?,`CTALaunchScreen3` = ? WHERE `messageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PushNotificationEntity value) {
        if (value.getMessageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMessageId());
        }
        stmt.bindLong(2, value.getTime());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
        if (value.getBig_image() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBig_image());
        }
        if (value.getLanding_type() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLanding_type());
        }
        if (value.getLanding_value() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanding_value());
        }
        if (value.getApp_version() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getApp_version());
        }
        if (value.getToolbar_title() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getToolbar_title());
        }
        if (value.getLarge_icon_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLarge_icon_url());
        }
        if (value.getGradientColors() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGradientColors());
        }
        if (value.getLaunchTargetScreenAction() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getLaunchTargetScreenAction());
        }
        if (value.getCTACaption1() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCTACaption1());
        }
        if (value.getCTALaunchScreen1() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCTALaunchScreen1());
        }
        if (value.getCTACaption2() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getCTACaption2());
        }
        if (value.getCTALaunchScreen2() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getCTALaunchScreen2());
        }
        if (value.getCTACaption3() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getCTACaption3());
        }
        if (value.getCTALaunchScreen3() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getCTALaunchScreen3());
        }
        if (value.getMessageId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getMessageId());
        }
      }
    };
  }

  @Override
  public Object insert(final PushNotificationEntity obj,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPushNotificationEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final PushNotificationEntity[] obj,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPushNotificationEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final PushNotificationEntity obj,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPushNotificationEntity.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final PushNotificationEntity obj,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPushNotificationEntity.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getNotifications(
      final Continuation<? super List<PushNotificationEntity>> continuation) {
    final String _sql = "SELECT * FROM PushNotificationEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PushNotificationEntity>>() {
      @Override
      public List<PushNotificationEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMessageId = CursorUtil.getColumnIndexOrThrow(_cursor, "messageId");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfBigImage = CursorUtil.getColumnIndexOrThrow(_cursor, "big_image");
          final int _cursorIndexOfLandingType = CursorUtil.getColumnIndexOrThrow(_cursor, "landing_type");
          final int _cursorIndexOfLandingValue = CursorUtil.getColumnIndexOrThrow(_cursor, "landing_value");
          final int _cursorIndexOfAppVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "app_version");
          final int _cursorIndexOfToolbarTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "toolbar_title");
          final int _cursorIndexOfLargeIconUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "large_icon_url");
          final int _cursorIndexOfGradientColors = CursorUtil.getColumnIndexOrThrow(_cursor, "gradientColors");
          final int _cursorIndexOfLaunchTargetScreenAction = CursorUtil.getColumnIndexOrThrow(_cursor, "launchTargetScreenAction");
          final int _cursorIndexOfCTACaption1 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTACaption1");
          final int _cursorIndexOfCTALaunchScreen1 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTALaunchScreen1");
          final int _cursorIndexOfCTACaption2 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTACaption2");
          final int _cursorIndexOfCTALaunchScreen2 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTALaunchScreen2");
          final int _cursorIndexOfCTACaption3 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTACaption3");
          final int _cursorIndexOfCTALaunchScreen3 = CursorUtil.getColumnIndexOrThrow(_cursor, "CTALaunchScreen3");
          final List<PushNotificationEntity> _result = new ArrayList<PushNotificationEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PushNotificationEntity _item;
            final String _tmpMessageId;
            if (_cursor.isNull(_cursorIndexOfMessageId)) {
              _tmpMessageId = null;
            } else {
              _tmpMessageId = _cursor.getString(_cursorIndexOfMessageId);
            }
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final String _tmpBig_image;
            if (_cursor.isNull(_cursorIndexOfBigImage)) {
              _tmpBig_image = null;
            } else {
              _tmpBig_image = _cursor.getString(_cursorIndexOfBigImage);
            }
            final String _tmpLanding_type;
            if (_cursor.isNull(_cursorIndexOfLandingType)) {
              _tmpLanding_type = null;
            } else {
              _tmpLanding_type = _cursor.getString(_cursorIndexOfLandingType);
            }
            final String _tmpLanding_value;
            if (_cursor.isNull(_cursorIndexOfLandingValue)) {
              _tmpLanding_value = null;
            } else {
              _tmpLanding_value = _cursor.getString(_cursorIndexOfLandingValue);
            }
            final String _tmpApp_version;
            if (_cursor.isNull(_cursorIndexOfAppVersion)) {
              _tmpApp_version = null;
            } else {
              _tmpApp_version = _cursor.getString(_cursorIndexOfAppVersion);
            }
            final String _tmpToolbar_title;
            if (_cursor.isNull(_cursorIndexOfToolbarTitle)) {
              _tmpToolbar_title = null;
            } else {
              _tmpToolbar_title = _cursor.getString(_cursorIndexOfToolbarTitle);
            }
            final String _tmpLarge_icon_url;
            if (_cursor.isNull(_cursorIndexOfLargeIconUrl)) {
              _tmpLarge_icon_url = null;
            } else {
              _tmpLarge_icon_url = _cursor.getString(_cursorIndexOfLargeIconUrl);
            }
            final String _tmpGradientColors;
            if (_cursor.isNull(_cursorIndexOfGradientColors)) {
              _tmpGradientColors = null;
            } else {
              _tmpGradientColors = _cursor.getString(_cursorIndexOfGradientColors);
            }
            final String _tmpLaunchTargetScreenAction;
            if (_cursor.isNull(_cursorIndexOfLaunchTargetScreenAction)) {
              _tmpLaunchTargetScreenAction = null;
            } else {
              _tmpLaunchTargetScreenAction = _cursor.getString(_cursorIndexOfLaunchTargetScreenAction);
            }
            final String _tmpCTACaption1;
            if (_cursor.isNull(_cursorIndexOfCTACaption1)) {
              _tmpCTACaption1 = null;
            } else {
              _tmpCTACaption1 = _cursor.getString(_cursorIndexOfCTACaption1);
            }
            final String _tmpCTALaunchScreen1;
            if (_cursor.isNull(_cursorIndexOfCTALaunchScreen1)) {
              _tmpCTALaunchScreen1 = null;
            } else {
              _tmpCTALaunchScreen1 = _cursor.getString(_cursorIndexOfCTALaunchScreen1);
            }
            final String _tmpCTACaption2;
            if (_cursor.isNull(_cursorIndexOfCTACaption2)) {
              _tmpCTACaption2 = null;
            } else {
              _tmpCTACaption2 = _cursor.getString(_cursorIndexOfCTACaption2);
            }
            final String _tmpCTALaunchScreen2;
            if (_cursor.isNull(_cursorIndexOfCTALaunchScreen2)) {
              _tmpCTALaunchScreen2 = null;
            } else {
              _tmpCTALaunchScreen2 = _cursor.getString(_cursorIndexOfCTALaunchScreen2);
            }
            final String _tmpCTACaption3;
            if (_cursor.isNull(_cursorIndexOfCTACaption3)) {
              _tmpCTACaption3 = null;
            } else {
              _tmpCTACaption3 = _cursor.getString(_cursorIndexOfCTACaption3);
            }
            final String _tmpCTALaunchScreen3;
            if (_cursor.isNull(_cursorIndexOfCTALaunchScreen3)) {
              _tmpCTALaunchScreen3 = null;
            } else {
              _tmpCTALaunchScreen3 = _cursor.getString(_cursorIndexOfCTALaunchScreen3);
            }
            _item = new PushNotificationEntity(_tmpMessageId,_tmpTime,_tmpTitle,_tmpBody,_tmpBig_image,_tmpLanding_type,_tmpLanding_value,_tmpApp_version,_tmpToolbar_title,_tmpLarge_icon_url,_tmpGradientColors,_tmpLaunchTargetScreenAction,_tmpCTACaption1,_tmpCTALaunchScreen1,_tmpCTACaption2,_tmpCTALaunchScreen2,_tmpCTACaption3,_tmpCTALaunchScreen3);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
