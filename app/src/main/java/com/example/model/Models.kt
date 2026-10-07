package com.example.model

data class Founder(
    val id: String,
    val name: String,
    val role: String,
    val bio: String,
    val highlights: List<String>
)

data class Course(
    val id: String,
    val title: String,
    val category: String,
    val shortDesc: String,
    val fullDesc: String,
    val targetAudience: String,
    val modules: List<String>,
    val durationHours: String,
    val iconName: String
)

data class ServiceItem(
    val id: String,
    val title: String,
    val category: String,
    val subtitle: String,
    val description: String,
    val benefits: List<String>,
    val iconName: String,
    val isFeatured: Boolean = false
)

data class Testimonial(
    val author: String,
    val company: String,
    val text: String,
    val rating: Int = 5
)
