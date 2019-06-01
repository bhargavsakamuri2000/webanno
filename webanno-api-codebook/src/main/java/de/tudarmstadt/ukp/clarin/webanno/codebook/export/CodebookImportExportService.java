/*
 * Copyright 2019
 * Ubiquitous Knowledge Processing (UKP) Lab Technische Universität Darmstadt  
 *  and Language Technology Group  Universität Hamburg 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.clarin.webanno.codebook.export;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.uima.UIMAException;
import org.apache.uima.cas.CAS;

import de.tudarmstadt.ukp.clarin.webanno.model.Mode;
import de.tudarmstadt.ukp.clarin.webanno.model.SourceDocument;

public interface CodebookImportExportService
{
    String SERVICE_NAME = "codebookImportExportService";
    
    File exportCodebooks(CAS cas, SourceDocument document, String fileName, File exportDir,
            boolean withHeaders, boolean withText, List<String> codebooks, String annotator,
            String documentName) throws IOException, UIMAException;

    File exportCodebookDocument(SourceDocument document, String user, String fileName, Mode mode,
            File exportDir, boolean withHeaders, boolean withText, List<String> codebooks)
            throws UIMAException, IOException, ClassNotFoundException;
}
