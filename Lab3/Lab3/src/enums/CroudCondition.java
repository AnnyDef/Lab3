package enums;

public enum CroudCondition { 
    NORMAL,       // levelOfFearCroud < 25 
    FRUSTRATION,  // 25..39 
    PANIC,        // 40..69 
    FEAR          // 70+ 
} 