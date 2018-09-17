/**
 * 
 */
package net.atos.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author A707592
 *
 */
@Data
@AllArgsConstructor
public class UploadFileResponse {
	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;
}
