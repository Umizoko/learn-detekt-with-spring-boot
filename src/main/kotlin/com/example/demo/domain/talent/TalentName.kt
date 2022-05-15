package com.example.demo.domain.talent

adata class TalentName(val value: String) {
    init {
        if (value.length > 255) {
            throw Exception("名前は255文字以下で入力してください")
        }
    }
}