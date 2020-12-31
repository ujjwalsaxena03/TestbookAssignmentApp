
package com.example.testbookapp

import com.google.gson.annotations.SerializedName


data class Responses(
    @SerializedName("curTime")
    val curTime: String?,
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("success")
    val success: Boolean?

)

data class Data(
    @SerializedName("classes")
    val classes: List<Classes>?
)


data class Classes(

    @SerializedName("affiliateAttributionPaused")
    val affiliateAttributionPaused: Boolean?,
    @SerializedName("availTill")
    val availTill: String?,
    @SerializedName("category")
    val category: String?,
    @SerializedName("classInfo")
    val classInfo: ClassInfo?,
    @SerializedName("classProperties")
    val classProperties: ClassProperties?,
    @SerializedName("coachingName")
    val coachingName: String?,
    @SerializedName("cost")
    val cost: Int?,
    @SerializedName("costUpfront")
    val costUpfront: Boolean?,
    @SerializedName("course")
    val course: Course?,
    @SerializedName("courseLogo")
    val courseLogo: String?,
    @SerializedName("courses")
    val courses: List<CourseX>?,
    @SerializedName("createdOn")
    val createdOn: String?,
    @SerializedName("createdby")
    val createdby: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("descriptions")
    val descriptions: Any?,
    @SerializedName("discountText")
    val discountText: String?,
    @SerializedName("doubtTag")
    val doubtTag: DoubtTag?,
    @SerializedName("extraFeatures")
    val extraFeatures: Any?,
    @SerializedName("features")
    val features: Any?,
    @SerializedName("freeProdId")
    val freeProdId: String?,
    @SerializedName("freeTestCount")
    val freeTestCount: Int?,
    @SerializedName("_id")
    val id: String?,
    @SerializedName("isClassCombo")
    val isClassCombo: Boolean?,
    @SerializedName("isCuratedTopic")
    val isCuratedTopic: Boolean?,
    @SerializedName("isCustom")
    val isCustom: Boolean?,
    @SerializedName("isDemoModuleAvail")
    val isDemoModuleAvail: Boolean?,
    @SerializedName("isFree")
    val isFree: Boolean?,
    @SerializedName("isHidden")
    val isHidden: Boolean?,
    @SerializedName("isOffer")
    val isOffer: Boolean?,
    @SerializedName("isPremium")
    val isPremium: Boolean?,
    @SerializedName("isRecommended")
    val isRecommended: Boolean?,
    @SerializedName("items")
    val items: Any?,
    @SerializedName("lastFreezedOn")
    val lastFreezedOn: String?,
    @SerializedName("lastUpdatedOn")
    val lastUpdatedOn: String?,
    @SerializedName("minCost")
    val minCost: Int?,
    @SerializedName("minPrice")
    val minPrice: Int?,
    @SerializedName("numPurchased")
    val numPurchased: Int?,
    @SerializedName("offerEnd")
    val offerEnd: String?,
    @SerializedName("offerStart")
    val offerStart: String?,
    @SerializedName("oldCost")
    val oldCost: Int?,
    @SerializedName("orgId")
    val orgId: String?,
    @SerializedName("postNote")
    val postNote: Any?,
    @SerializedName("publishCompleted")
    val publishCompleted: Boolean?,
    @SerializedName("quantity")
    val quantity: Int?,
    @SerializedName("recommendedFor")
    val recommendedFor: String?,
    @SerializedName("releaseDate")
    val releaseDate: String?,
    @SerializedName("segId")
    val segId: String?,
    @SerializedName("shortDesc")
    val shortDesc: Any?,
    @SerializedName("showSyllabus")
    val showSyllabus: Boolean?,
    @SerializedName("slugUrl")
    val slugUrl: String?,
    @SerializedName("specificExams")
    val specificExams: List<SpecificExam>?,
    @SerializedName("stage")
    val stage: String?,
    @SerializedName("stopEvents")
    val stopEvents: Boolean?,
    @SerializedName("summary")
    val summary: Summary?,
    @SerializedName("target")
    val target: List<Target>?,
    @SerializedName("targetSuperGroup")
    val targetSuperGroup: List<TargetSuperGroup>?,
    @SerializedName("thumbnailInfo")
    val thumbnailInfo: ThumbnailInfo?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("titles")
    val titles: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("weight")
    val weight: Int?
)

data class ClassInfo(
    @SerializedName("classFeature")
    val classFeature: ClassFeature?,
    @SerializedName("courseSellingImage")
    val courseSellingImage: String?,
    @SerializedName("facultiesImage")
    val facultiesImage: String?,
    @SerializedName("faqs")
    val faqs: List<List<Faq>>?,
    @SerializedName("introVideoUrl")
    val introVideoUrl: String?,
    @SerializedName("preRequisites")
    val preRequisites: PreRequisites?,
    @SerializedName("subjectWiseSyllabus")
    val subjectWiseSyllabus: SubjectWiseSyllabus?,
    @SerializedName("testimonials")
    val testimonials: List<Testimonial>?,
    @SerializedName("whyTakeThisCourse")
    val whyTakeThisCourse: WhyTakeThisCourse?
)

data class ClassProperties(
    @SerializedName("classType")
    val classType: ClassType?,
    @SerializedName("color")
    val color: String?,
    @SerializedName("contentDuration")
    val contentDuration: Int?,
    @SerializedName("curriculum")
    val curriculum: Curriculum?,
    @SerializedName("instructors")
    val instructors: List<Instructor>?,
    @SerializedName("isCoachNotAvailable")
    val isCoachNotAvailable: Boolean?,
    @SerializedName("languageInfo")
    val languageInfo: String?,
    @SerializedName("languagesInfo")
    val languagesInfo: String?,
    @SerializedName("materialLangInfo")
    val materialLangInfo: String?,
    @SerializedName("privateDiscussionUrl")
    val privateDiscussionUrl: String?,
    @SerializedName("showLiveCourseTag")
    val showLiveCourseTag: Boolean?,
    @SerializedName("slug")
    val slug: Slug?,
    @SerializedName("subjects")
    val subjects: List<Any>?
)

data class Course(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)

data class CourseX(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)

data class DoubtTag(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?
)

data class SpecificExam(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)

data class Summary(
    @SerializedName("module")
    val module: Module?,
    @SerializedName("rating")
    val rating: Rating?
)

data class Target(
    @SerializedName("_id")
    val id: String?,
    @SerializedName("isPrimary")
    val isPrimary: Boolean?,
    @SerializedName("title")
    val title: String?
)

data class TargetSuperGroup(
    @SerializedName("_id")
    val id: String?,
    @SerializedName("isPrimary")
    val isPrimary: Boolean?,
    @SerializedName("title")
    val title: String?
)

data class ThumbnailInfo(
    @SerializedName("description")
    val description: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("url")
    val url: String?
)

data class ClassFeature(
    @SerializedName("features")
    val features: List<Feature>?,
    @SerializedName("text")
    val text: String?
)

data class Faq(
    @SerializedName("answer")
    val answer: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("question")
    val question: String?
)

data class PreRequisites(
    @SerializedName("comments")
    val comments: List<String>?,
    @SerializedName("text")
    val text: String?
)

data class SubjectWiseSyllabus(
    @SerializedName("comments")
    val comments: List<String>?,
    @SerializedName("text")
    val text: String?
)

data class Testimonial(
    @SerializedName("image")
    val image: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("rating")
    val rating: Double?,
    @SerializedName("review")
    val review: String?
)

data class WhyTakeThisCourse(
    @SerializedName("comments")
    val comments: List<String>?,
    @SerializedName("text")
    val text: String?
)

data class Feature(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("showInSummary")
    val showInSummary: Boolean?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("type")
    val type: String?
)

data class ClassType(
    @SerializedName("classFrom")
    val classFrom: String?,
    @SerializedName("classTill")
    val classTill: String?,
    @SerializedName("lastEnrollmentDate")
    val lastEnrollmentDate: String?,
    @SerializedName("type")
    val type: String?
)

data class Curriculum(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("title")
    val title: Any?,
    @SerializedName("url")
    val url: Any?
)

data class Instructor(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)

data class Slug(
    @SerializedName("prefix")
    val prefix: String?,
    @SerializedName("suffix")
    val suffix: String?
)

data class Module(
    @SerializedName("count")
    val count: Count?
)

data class Rating(
    @SerializedName("actual")
    val `actual`: Double?,
    @SerializedName("value")
    val value: Double?
)

data class Count(
    @SerializedName("Doubt Class")
    val doubtClass: Int?,
    @SerializedName("Live Class")
    val liveClass: Int?,
    @SerializedName("Notes")
    val notes: Int?,
    @SerializedName("Practice")
    val practice: Int?,
    @SerializedName("Quiz")
    val quiz: Int?,
    @SerializedName("Test")
    val test: Int?,
    @SerializedName("Video")
    val video: Int?
)
