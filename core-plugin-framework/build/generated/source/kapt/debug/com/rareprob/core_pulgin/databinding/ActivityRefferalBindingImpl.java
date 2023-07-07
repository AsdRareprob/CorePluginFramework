package com.rareprob.core_pulgin.databinding;
import com.rareprob.core_pulgin.R;
import com.rareprob.core_pulgin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRefferalBindingImpl extends ActivityRefferalBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(1, 
            new String[] {"view_profile_section"},
            new int[] {2},
            new int[] {com.rareprob.core_pulgin.R.layout.view_profile_section});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.earnCoins, 3);
        sViewsWithIds.put(R.id.iv_earn, 4);
        sViewsWithIds.put(R.id.tv_earn, 5);
        sViewsWithIds.put(R.id.exchange, 6);
        sViewsWithIds.put(R.id.iv_exchange, 7);
        sViewsWithIds.put(R.id.tv_exchange, 8);
        sViewsWithIds.put(R.id.earn_indicator, 9);
        sViewsWithIds.put(R.id.exchange_indicator, 10);
        sViewsWithIds.put(R.id.viewPager, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRefferalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityRefferalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.rareprob.core_pulgin.databinding.ViewProfileSectionBinding) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.view.View) bindings[9]
            , (android.widget.LinearLayout) bindings[6]
            , (android.view.View) bindings[10]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (androidx.viewpager.widget.ViewPager) bindings[11]
            );
        setContainedBinding(this.clProfileSection);
        this.frmlCoinContainer.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        clProfileSection.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (clProfileSection.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        clProfileSection.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeClProfileSection((com.rareprob.core_pulgin.databinding.ViewProfileSectionBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeClProfileSection(com.rareprob.core_pulgin.databinding.ViewProfileSectionBinding ClProfileSection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(clProfileSection);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clProfileSection
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}