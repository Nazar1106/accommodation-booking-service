package com.example.accommodationbookingservice.testutil;

import com.example.accommodationbookingservice.entity.telegram.TelegramChat;
import com.example.accommodationbookingservice.testutil.UserUtil;

public class TelegramChatUtil {

    public static TelegramChat getTelegramChat() {
        TelegramChat telegramChat = new TelegramChat();
        telegramChat.setChatId(1L);
        telegramChat.setId(1L);
        telegramChat.setDeleted(false);
        telegramChat.setUser(UserUtil.getUser());

        return telegramChat;
    }

}
