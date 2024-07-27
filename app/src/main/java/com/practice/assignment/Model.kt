package com.practice.assignment

import android.nfc.Tag
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


data class DesignFile(
    val id: String,
    val name: String,
    val type: String,
    val section: String,
    val tags: List<Tag>,
    val file: String,
    val version: Int,
    val status: Int,
    val commentCount: Int,
    val uploadedAt: String,
    val uploadedBy: UploadedBy,
    val fileSize: Double
)

data class Tag(
    val id: String, val name: String
)

data class UploadedBy(
    val id: String, val name: String, val photo: String, val organizationName: String
)

data class Person(val id: Int, val name: String)


class Data {
    private lateinit var designFiles: List<DesignFile>

    init {
        initData()
    }

    private fun initData() {
        designFiles = listOf(

            DesignFile(
                "631RvOMPkLKDPNny",
                "adcf0b821ed440a3bb3080572dff0d09",
                "IMAGE",
                "PROD",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/a10a84b51d5d4b5aa35e66067a732930.jpeg",
                1,
                0,
                0,
                "2023-04-24T09:04:20.503933+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                0.18
            ),

            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "PROD",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            ),

            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "PROD",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            ),

            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "3D",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            ),


            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "PROD",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            ),


            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "PROD",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            ),

            DesignFile(
                "g1EJwqjOkNjY7DlG",
                "Central wall flex",
                "DOC",
                "2D",
                emptyList(),
                "https://ik.imagekit.io/91sqft/dev/design-file-version/43440445e6e5457687306996b3dc84a1.pdf",
                1,
                0,
                0,
                "2023-04-24T09:04:07.261115+05:30",
                UploadedBy(
                    "VOl2aWKEa8K7oNnx",
                    "Tanweer Hossain",
                    "https://ik.imagekit.io/91sqft/dev/user/39e0ba4b49b445b98baaf2efcfde7222.png",
                    "91Squarefeet"
                ),
                10.52
            )

        )
    }

    fun getData(section: String): List<DesignFile> {
        return designFiles.filter { design ->
            design.section == section
        }
    }

    @Composable
    fun distinctSections(): List<String> {
        return designFiles.map { it.section }.distinct()
    }

}

