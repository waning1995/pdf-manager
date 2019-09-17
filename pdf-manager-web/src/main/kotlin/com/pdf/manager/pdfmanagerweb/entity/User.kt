package com.pdf.manager.pdfmanagerweb.entity

import com.pdf.manager.pdfmanagerweb.delegate.PdfDelegate

/**
 * 用户实体
 */
data class User(
        /**
         * 主键
         */
        val id: String,

        /**
         * 名称
         */
        val name: String,

        /**
         * 密码
         */
        val password: String,

        /**
         * 手机号
         */
        val mobilePhoneNumber: String
) {
    val pdfs: Iterable<Pdf> by PdfDelegate()
}